/*
This fragment shader contains a lot of features that may be enabled during compile time by defining one or more of the
following. There are no defaults. At the minimum, the user must define a filter.

    #define OVERLAY_ENABLED
        Turns on the overlay texture. This will be blended onto the filtered image using its alpha.

    #define SPLIT_FILTER_ENABLED
        Turns on split-screen rendering so that half of the screen displays on filter and the other half of the
        screen displays another filter. The uSplit uniforms must be set by the user.

    #define FILTER_NORMAL
    #define FILTER_GREYSCALE
    #define FILTER_SEPIA
    #define FILTER_INSTASNAP
        When SPLIT_FILTER_ENABLED is not defined, one of the above must be defined for the filter.

    #define LEFT_FILTER_NORMAL
    #define LEFT_FILTER_GREYSCALE
    #define LEFT_FILTER_SEPIA
    #define LEFT_FILTER_INSTASNAP
        Defines the left filter. If SPLIT_FILTER_ENABLED is defined, one of the following must also be defined.

    #define RIGHT_FILTER_NORMAL
    #define RIGHT_FILTER_GREYSCALE
    #define RIGHT_FILTER_SEPIA
    #define RIGHT_FILTER_INSTASNAP
        Defines the right filter. If SPLIT_FILTER_ENABLED is defined, one of the following must also be defined.
*/

#extension GL_OES_EGL_image_external : require

precision mediump float;

varying float vHorizontalPosition; // from 0-1
varying vec2 vTextureCoord;

uniform samplerExternalOES sExternalTexture;

#if defined(FILTER_MISS_ETIKATE) || defined(LEFT_FILTER_MISS_ETIKATE) || defined(RIGHT_FILTER_MISS_ETIKATE)
uniform sampler2D sMissEtikateLookupTexture;
#endif

#if defined(OVERLAY_ENABLED)
uniform sampler2D sOverlayTexture;
#endif

#if defined(SPLIT_FILTER_ENABLED)
uniform float uSplit;
#endif

uniform float uWidth;
uniform float uHeight;
uniform int uBlurLevel;

void main() {
    vec4 externalSample = texture2D(sExternalTexture, vTextureCoord);
    vec3 externalSampleRgb = externalSample.rgb;

    /* Compute each filter needed */

#if defined(FILTER_GAUSSIAN_BLUR)
	vec3 result = vec3(0.0);
	// Gaussian kernel weight matrix. Pre-computed. Too expensive to calculate at run time.
    float weights[9];
    // Pixel position matching Gaussian kernel
    vec2 posxy[9];
    if(uBlurLevel == 10){
        // sigma = 9, very strong blur
        weights[0] = 0.110653870; weights[1] = 0.111339033; weights[2] = 0.110653870;
        weights[3] = 0.111339033; weights[4] = 0.112028435; weights[5] = 0.111339033;
        weights[6] = 0.110653870; weights[7] = 0.111339033; weights[8] = 0.110653870;
    }else if(uBlurLevel == 9){
        // sigma = 8, very strong blur
        weights[0] = 0.110532403; weights[1] = 0.111399315; weights[2] = 0.110532403;
        weights[3] = 0.111399315; weights[4] = 0.112273030; weights[5] = 0.111399315;
        weights[6] = 0.110532403; weights[7] = 0.111399315; weights[8] = 0.110532403;
    }else if(uBlurLevel == 8){
        // sigma = 7, strong blur
        weights[0] = 0.110355265; weights[1] = 0.111487098; weights[2] = 0.110355265;
        weights[3] = 0.111487098; weights[4] = 0.112630546; weights[5] = 0.111487098;
        weights[6] = 0.110355265; weights[7] = 0.111487098; weights[8] = 0.110355265;
    }else if(uBlurLevel == 7){
        // sigma = 6, strong blur
        weights[0] = 0.110082321; weights[1] = 0.111621909; weights[2] = 0.110082321;
        weights[3] = 0.111621909; weights[4] = 0.113183029; weights[5] = 0.111621909;
        weights[6] = 0.110082321; weights[7] = 0.111621909; weights[8] = 0.110082321;
    }else if(uBlurLevel == 6){
        // sigma = 5, medium level blur
        weights[0] = 0.109629698; weights[1] = 0.111844361; weights[2] = 0.109629698;
        weights[3] = 0.111844361; weights[4] = 0.114103764; weights[5] = 0.111844361;
        weights[6] = 0.109629698; weights[7] = 0.111844361; weights[8] = 0.109629698;
    }else if(uBlurLevel == 5){
        // sigma = 4, medium level blur
        weights[0] = 0.108796552; weights[1] = 0.112250119; weights[2] = 0.108796552;
        weights[3] = 0.112250119; weights[4] = 0.115813322; weights[5] = 0.112250119;
        weights[6] = 0.108796552; weights[7] = 0.112250119; weights[8] = 0.108796552;
    }else if(uBlurLevel == 4){
        // sigma = 3, medium level blur
        weights[0] = 0.106997311; weights[1] = 0.113109827; weights[2] = 0.106997311;
        weights[3] = 0.113109827; weights[4] = 0.119571537; weights[5] = 0.113109827;
        weights[6] = 0.106997311; weights[7] = 0.113109827; weights[8] = 0.106997311;
    }else if(uBlurLevel == 3){
        // sigma = 2, slight blur
        weights[0] = 0.101868056; weights[1] = 0.115431637; weights[2] = 0.101868056;
        weights[3] = 0.115431637; weights[4] = 0.130801171; weights[5] = 0.115431637;
        weights[6] = 0.101868056; weights[7] = 0.115431637; weights[8] = 0.101868056;
    }else if(uBlurLevel == 2){
        // sigma = 1, slight blur
        weights[0] = 0.075113609; weights[1] = 0.123841412; weights[2] = 0.075113609;
        weights[3] = 0.123841412; weights[4] = 0.204179958; weights[5] = 0.123841412;
        weights[6] = 0.075113609; weights[7] = 0.123841412; weights[8] = 0.075113609;
    }else if(uBlurLevel == 1){
        // sigma = 0.5, slight blur
        weights[0] = 0.011343737; weights[1] = 0.083819509; weights[2] = 0.011343737;
        weights[3] = 0.083819509; weights[4] = 0.619347036; weights[5] = 0.083819509;
        weights[6] = 0.011343737; weights[7] = 0.083819509; weights[8] = 0.011343737;
    }else{
        // default, sigma = 1, slight blur
        weights[0] = 0.075113609; weights[1] = 0.123841412; weights[2] = 0.075113609;
        weights[3] = 0.123841412; weights[4] = 0.204179958; weights[5] = 0.123841412;
        weights[6] = 0.075113609; weights[7] = 0.123841412; weights[8] = 0.075113609;
    }

	posxy[0] = clamp(vTextureCoord + vec2(-1.0/uWidth, 1.0/uHeight), 0.0, 1.0);
	posxy[1] = clamp(vTextureCoord + vec2( 0.0, 1.0/uHeight), 0.0, 1.0);
	posxy[2] = clamp(vTextureCoord + vec2( 1.0/uWidth, 1.0/uHeight), 0.0, 1.0);
	posxy[3] = clamp(vTextureCoord + vec2(-1.0/uWidth, 0.0), 0.0, 1.0);
	posxy[4] = clamp(vTextureCoord + vec2( 0.0, 0.0), 0.0, 1.0);
	posxy[5] = clamp(vTextureCoord + vec2( 1.0/uWidth, 0.0), 0.0, 1.0);
	posxy[6] = clamp(vTextureCoord + vec2(-1.0/uWidth, -1.0/uHeight), 0.0, 1.0);
	posxy[7] = clamp(vTextureCoord + vec2( 0.0, -1.0/uHeight), 0.0, 1.0);
	posxy[8] = clamp(vTextureCoord + vec2( 1.0/uWidth, -1.0/uHeight), 0.0, 1.0);

    result = texture2D(sExternalTexture, posxy[0]).rgb * weights[0] +
             texture2D(sExternalTexture, posxy[1]).rgb * weights[1] +
             texture2D(sExternalTexture, posxy[2]).rgb * weights[2] +
             texture2D(sExternalTexture, posxy[3]).rgb * weights[3] +
             texture2D(sExternalTexture, posxy[4]).rgb * weights[4] +
             texture2D(sExternalTexture, posxy[5]).rgb * weights[5] +
             texture2D(sExternalTexture, posxy[6]).rgb * weights[6] +
             texture2D(sExternalTexture, posxy[7]).rgb * weights[7] +
             texture2D(sExternalTexture, posxy[8]).rgb * weights[8];

	externalSample = vec4(result, 1.0);
	externalSampleRgb = externalSample.rgb;
#endif

#if defined(FILTER_NORMAL) || defined(LEFT_FILTER_NORMAL) || defined(RIGHT_FILTER_NORMAL)
    vec4 normalFilter = externalSample;
#endif

#if defined(FILTER_GREYSCALE) || defined(LEFT_FILTER_GREYSCALE) || defined(RIGHT_FILTER_GREYSCALE)
    vec3 R0 = vec3(0.299, 0.587, 0.114);
    float luminance = dot(externalSampleRgb, R0);
    vec4 greyscaleFilter = vec4(luminance, luminance, luminance, 1.);
#endif

#if defined(FILTER_SEPIA) || defined(LEFT_FILTER_SEPIA) || defined(RIGHT_FILTER_SEPIA)
    lowp mat4 colorMatrix = mat4(0.3588, 0.7044, 0.1368, 0.0,
                                 0.2990, 0.5870, 0.1140, 0.0,
                                 0.2392, 0.4969, 0.0912, 0.0,
                                 0.0,    0.0,    0.0,    1.0);
    lowp float intensity = 1.0;
    lowp vec4 textureColor = externalSample;
    lowp vec4 outputColor = textureColor * colorMatrix;
    vec4 sepiaFilter = (intensity * outputColor) + ((1.0 - intensity) * textureColor);
#endif

#if defined(FILTER_INSTASNAP) || defined(LEFT_FILTER_INSTASNAP) || defined(RIGHT_FILTER_INSTASNAP)
    float red = externalSampleRgb.x * 0.9647;
    float green = externalSampleRgb.y * 0.8666;
    float blue = 0.1330 + 0.5454 * externalSampleRgb.z;
    vec4 instasnapFilter = vec4(red, green, blue, 1.0);
#endif

#if defined(FILTER_MISS_ETIKATE) || defined(LEFT_FILTER_MISS_ETIKATE) || defined(RIGHT_FILTER_MISS_ETIKATE)
    //TODO: Swizzling some operations may have performance benefits
    //(https://github.com/Snapchat/camera-android-transcoding-library/pull/66#discussion_r28468009)
    vec4 missEtikateLookupSample = texture2D(sMissEtikateLookupTexture, vTextureCoord);
    vec4 baseTexture = externalSample;
    baseTexture.rgb = clamp(baseTexture.rgb, 0.0, 1.0);
    mediump float blueColor = baseTexture.b * 63.0;
    mediump vec2 quad1;
    quad1.y = floor(floor(blueColor) / 8.0);
    quad1.x = floor(blueColor) - (quad1.y * 8.0);
    mediump vec2 quad2;
    quad2.y = floor(ceil(blueColor) / 8.0);
    quad2.x = ceil(blueColor) - (quad2.y * 8.0);
    highp vec2 texPos1;
    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * baseTexture.r);
    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * baseTexture.g);
    highp vec2 texPos2;
    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * baseTexture.r);
    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * baseTexture.g);
    lowp vec4 newColor1 = texture2D(sMissEtikateLookupTexture, texPos1);
    lowp vec4 newColor2 = texture2D(sMissEtikateLookupTexture, texPos2);
    lowp vec4 missEtikateFilter = mix(newColor1, newColor2, fract(blueColor));
#endif

    /* Determine which filters get used */

#if defined(FILTER_NORMAL) || defined(LEFT_FILTER_NORMAL)
    vec4 sample = normalFilter;
#elif defined(FILTER_GREYSCALE) || defined(LEFT_FILTER_GREYSCALE)
    vec4 sample = greyscaleFilter;
#elif defined(FILTER_SEPIA) || defined(LEFT_FILTER_SEPIA)
    vec4 sample = sepiaFilter;
#elif defined(FILTER_INSTASNAP) || defined(LEFT_FILTER_INSTASNAP)
    vec4 sample = instasnapFilter;
#elif defined(FILTER_MISS_ETIKATE) || defined(LEFT_FILTER_MISS_ETIKATE)
    vec4 sample = missEtikateFilter;
#endif

#if defined(RIGHT_FILTER_NORMAL)
    vec4 rightSample = normalFilter;
#elif defined(RIGHT_FILTER_GREYSCALE)
    vec4 rightSample = greyscaleFilter;
#elif defined(RIGHT_FILTER_SEPIA)
    vec4 rightSample = sepiaFilter;
#elif defined(RIGHT_FILTER_INSTASNAP)
    vec4 rightSample = instasnapFilter;
#elif defined(RIGHT_FILTER_MISS_ETIKATE)
    vec4 rightSample = missEtikateFilter;
#endif

    /* Combine the filters and overlay to produce gl_FragColor */

#if defined(SPLIT_FILTER_ENABLED)
    float isLeftSample = step(vHorizontalPosition, uSplit);
    float isRightSample = 1.0 - isLeftSample;
    sample = sample * isLeftSample + rightSample * isRightSample;
#endif

#if defined(OVERLAY_ENABLED)
    vec4 overlaySample = texture2D(sOverlayTexture, vTextureCoord);
    sample = sample * (1.0 - overlaySample.a) + overlaySample;
#endif

    gl_FragColor = sample;
}
