// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.photos.base;

import com.google.common.io.BaseEncoding;
import com.google.common.primitives.Longs;

public class ImageUrlOptionsStringBuilder
{

    protected int borderColor;
    protected int borderSize;
    protected boolean bypassTakedown;
    protected boolean bypassTakedownSigned;
    protected boolean centerCrop;
    protected boolean centerCropSigned;
    protected boolean circleCrop;
    protected boolean circleCropSigned;
    protected boolean crop;
    protected boolean cropSigned;
    protected boolean download;
    protected boolean downloadSigned;
    protected boolean esPortraitApprovedOnly;
    protected boolean esPortraitApprovedOnlySigned;
    protected int expirationTime;
    protected boolean expirationTimeSigned;
    protected int focalPlane;
    protected boolean focalPlaneSigned;
    protected int focusBlur;
    protected boolean focusBlurSigned;
    protected boolean forceTileGeneration;
    protected boolean forceTileGenerationSigned;
    protected boolean forceTransformation;
    protected boolean forceTransformationSigned;
    protected long frameId;
    protected boolean hasBorderColor;
    protected boolean hasFrameId;
    protected boolean hasObjectId;
    protected int height;
    protected boolean heightSigned;
    protected boolean horizontalFlip;
    protected boolean horizontalFlipSigned;
    protected boolean html;
    protected boolean htmlSigned;
    protected boolean ignoreReferer;
    protected boolean ignoreRefererSigned;
    protected boolean imageCrop;
    protected boolean imageCropSigned;
    protected String imageFilter;
    protected boolean imageFilterSigned;
    protected boolean includeMetadata;
    protected boolean includePublicMetadata;
    protected boolean includePublicMetadataSigned;
    protected boolean killAnimation;
    protected boolean killAnimationSigned;
    protected boolean looseFaceCrop;
    protected boolean looseFaceCropSigned;
    protected boolean matchVersion;
    protected boolean matchVersionSigned;
    protected boolean noCorrectExifOrientation;
    protected boolean noCorrectExifOrientationSigned;
    protected boolean noDefaultImage;
    protected boolean noDefaultImageSigned;
    protected boolean noOverlay;
    protected boolean noOverlaySigned;
    protected boolean noSilhouette;
    protected boolean noSilhouetteSigned;
    protected boolean noUpscale;
    protected boolean noUpscaleSigned;
    protected boolean noWebp;
    protected boolean noWebpSigned;
    protected long objectId;
    protected boolean overlay;
    protected boolean overlaySigned;
    protected boolean pad;
    protected boolean padSigned;
    protected boolean preserveAspectRatio;
    protected boolean preserveAspectRatioSigned;
    protected int qualityBucket;
    protected boolean qualityBucketSigned;
    protected int qualityLevel;
    protected boolean qualityLevelSigned;
    protected String queryString;
    protected boolean queryStringSigned;
    protected boolean requestAnimatedWebp;
    protected boolean requestAnimatedWebpSigned;
    protected boolean requestGif;
    protected boolean requestGifSigned;
    protected boolean requestH264;
    protected boolean requestH264Signed;
    protected boolean requestJpeg;
    protected boolean requestJpegSigned;
    protected boolean requestPng;
    protected boolean requestPngSigned;
    protected boolean requestWebp;
    protected boolean requestWebpSigned;
    protected boolean requestWebpUnlessMaybeTransparent;
    protected boolean requestWebpUnlessMaybeTransparentSigned;
    protected int rotate;
    protected boolean rotateSigned;
    protected int selectFrameNumber;
    protected boolean selectFrameNumberSigned;
    protected int size;
    protected boolean sizeSigned;
    protected boolean smartCrop;
    protected boolean smartCropNoClip;
    protected boolean smartCropNoClipSigned;
    protected boolean smartCropSigned;
    protected boolean smartCropUseFace;
    protected boolean smartCropUseFaceSigned;
    protected boolean stretch;
    protected boolean stretchSigned;
    protected boolean tileGeneration;
    protected boolean tileGenerationSigned;
    protected boolean tileSigned;
    protected int tileX;
    protected int tileY;
    protected int tileZoom;
    protected boolean unfiltered;
    protected boolean unfilteredWithTransforms;
    protected boolean verticalFlip;
    protected boolean verticalFlipSigned;
    protected long videoBegin;
    protected boolean videoBeginSigned;
    protected int videoFormat;
    protected boolean videoFormatSigned;
    protected long videoLength;
    protected boolean videoLengthSigned;
    protected int width;
    protected boolean widthSigned;

    public ImageUrlOptionsStringBuilder()
    {
        size = -1;
        width = -1;
        height = -1;
        rotate = -1;
        tileX = -1;
        tileY = -1;
        tileZoom = -1;
        expirationTime = -1;
        imageFilter = "";
        queryString = "";
        borderSize = -1;
        hasBorderColor = false;
        focusBlur = -1;
        focalPlane = -1;
        qualityLevel = -1;
        qualityBucket = -1;
        selectFrameNumber = -1;
        videoFormat = -1;
        videoBegin = -1L;
        videoLength = -1L;
        looseFaceCrop = false;
        matchVersion = false;
    }

    private static String convertIntToHexStringUnsigned(int i)
    {
        return String.format("%08x", new Object[] {
            Integer.valueOf(i)
        });
    }

    private boolean isDefaultBorderSize()
    {
        return borderSize == -1;
    }

    private boolean isDefaultBypassTakedown()
    {
        return !bypassTakedown;
    }

    private boolean isDefaultCenterCrop()
    {
        return !centerCrop;
    }

    private boolean isDefaultCircleCrop()
    {
        return !circleCrop;
    }

    private boolean isDefaultCrop()
    {
        return !crop;
    }

    private boolean isDefaultDownload()
    {
        return !download;
    }

    private boolean isDefaultEsPortraitApprovedOnly()
    {
        return !esPortraitApprovedOnly;
    }

    private boolean isDefaultExpirationTime()
    {
        return expirationTime == -1;
    }

    private boolean isDefaultFocalPlane()
    {
        return focalPlane == -1;
    }

    private boolean isDefaultFocusBlur()
    {
        return focusBlur == -1;
    }

    private boolean isDefaultForceTileGeneration()
    {
        return !forceTileGeneration;
    }

    private boolean isDefaultForceTransformation()
    {
        return !forceTransformation;
    }

    private boolean isDefaultFrameId()
    {
        return !hasFrameId;
    }

    private boolean isDefaultHeight()
    {
        return height == -1;
    }

    private boolean isDefaultHorizontalFlip()
    {
        return !horizontalFlip;
    }

    private boolean isDefaultHtml()
    {
        return !html;
    }

    private boolean isDefaultIgnoreReferer()
    {
        return !ignoreReferer;
    }

    private boolean isDefaultImageCrop()
    {
        return !imageCrop;
    }

    private boolean isDefaultImageFilter()
    {
        return imageFilter.isEmpty();
    }

    private boolean isDefaultIncludeMetadata()
    {
        return !includeMetadata;
    }

    private boolean isDefaultIncludePublicMetadata()
    {
        return !includePublicMetadata;
    }

    private boolean isDefaultKillAnimation()
    {
        return !killAnimation;
    }

    private boolean isDefaultLooseFaceCrop()
    {
        return !looseFaceCrop;
    }

    private boolean isDefaultMatchVersion()
    {
        return !matchVersion;
    }

    private boolean isDefaultNoCorrectExifOrientation()
    {
        return !noCorrectExifOrientation;
    }

    private boolean isDefaultNoDefaultImage()
    {
        return !noDefaultImage;
    }

    private boolean isDefaultNoOverlay()
    {
        return !noOverlay;
    }

    private boolean isDefaultNoSilhouette()
    {
        return !noSilhouette;
    }

    private boolean isDefaultNoUpscale()
    {
        return !noUpscale;
    }

    private boolean isDefaultNoWebp()
    {
        return !noWebp;
    }

    private boolean isDefaultObjectId()
    {
        return !hasObjectId;
    }

    private boolean isDefaultOverlay()
    {
        return !overlay;
    }

    private boolean isDefaultPad()
    {
        return !pad;
    }

    private boolean isDefaultPreserveAspectRatio()
    {
        return !preserveAspectRatio;
    }

    private boolean isDefaultQualityBucket()
    {
        return qualityBucket == -1;
    }

    private boolean isDefaultQualityLevel()
    {
        return qualityLevel == -1;
    }

    private boolean isDefaultQueryString()
    {
        return queryString.isEmpty();
    }

    private boolean isDefaultRequestAnimatedWebp()
    {
        return !requestAnimatedWebp;
    }

    private boolean isDefaultRequestGif()
    {
        return !requestGif;
    }

    private boolean isDefaultRequestH264()
    {
        return !requestH264;
    }

    private boolean isDefaultRequestJpeg()
    {
        return !requestJpeg;
    }

    private boolean isDefaultRequestPng()
    {
        return !requestPng;
    }

    private boolean isDefaultRequestWebp()
    {
        return !requestWebp;
    }

    private boolean isDefaultRequestWebpUnlessMaybeTransparent()
    {
        return !requestWebpUnlessMaybeTransparent;
    }

    private boolean isDefaultRotate()
    {
        return rotate == -1;
    }

    private boolean isDefaultSelectFrameNumber()
    {
        return selectFrameNumber == -1;
    }

    private boolean isDefaultSize()
    {
        return size == -1;
    }

    private boolean isDefaultSmartCrop()
    {
        return !smartCrop;
    }

    private boolean isDefaultSmartCropNoClip()
    {
        return !smartCropNoClip;
    }

    private boolean isDefaultSmartCropUseFace()
    {
        return !smartCropUseFace;
    }

    private boolean isDefaultStretch()
    {
        return !stretch;
    }

    private boolean isDefaultTile()
    {
        return !isTile();
    }

    private boolean isDefaultTileGeneration()
    {
        return !tileGeneration;
    }

    private boolean isDefaultUnfiltered()
    {
        return !unfiltered;
    }

    private boolean isDefaultUnfilteredWithTransforms()
    {
        return !unfilteredWithTransforms;
    }

    private boolean isDefaultVerticalFlip()
    {
        return !verticalFlip;
    }

    private boolean isDefaultVideoBegin()
    {
        return videoBegin == -1L;
    }

    private boolean isDefaultVideoFormat()
    {
        return videoFormat == -1;
    }

    private boolean isDefaultVideoLength()
    {
        return videoLength == -1L;
    }

    private boolean isDefaultWidth()
    {
        return width == -1;
    }

    private boolean isTile()
    {
        return tileX != -1 && tileY != -1 && tileZoom != -1;
    }

    public final ImageUrlOptionsStringBuilder setSize(int i, boolean flag)
    {
        size = i;
        sizeSigned = flag;
        return this;
    }

    public final ImageUrlOptionsStringBuilder setSmartCrop(boolean flag, boolean flag1)
    {
        smartCrop = flag;
        smartCropSigned = flag1;
        return this;
    }

    public final String toString(String s, boolean flag)
    {
        String s1;
label0:
        {
            boolean flag2 = false;
            StringBuilder stringbuilder = new StringBuilder();
            boolean flag1 = flag2;
            if (isDefaultSize())
            {
                break label0;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!sizeSigned)
                {
                    break label0;
                }
            }
            stringbuilder.append(s);
            flag1 = true;
            String s2;
            if (sizeSigned)
            {
                s1 = "S";
            } else
            {
                s1 = "s";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(size));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label1:
        {
            flag2 = flag1;
            if (isDefaultWidth())
            {
                break label1;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!widthSigned)
                {
                    break label1;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (widthSigned)
            {
                s1 = "W";
            } else
            {
                s1 = "w";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(width));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label2:
        {
            flag1 = flag2;
            if (isDefaultCrop())
            {
                break label2;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!cropSigned)
                {
                    break label2;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (cropSigned)
            {
                s1 = "C";
            } else
            {
                s1 = "c";
            }
            stringbuilder.append(s1);
        }
label3:
        {
            flag2 = flag1;
            if (isDefaultDownload())
            {
                break label3;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!downloadSigned)
                {
                    break label3;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (downloadSigned)
            {
                s1 = "D";
            } else
            {
                s1 = "d";
            }
            stringbuilder.append(s1);
        }
label4:
        {
            flag1 = flag2;
            if (isDefaultHeight())
            {
                break label4;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!heightSigned)
                {
                    break label4;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (heightSigned)
            {
                s1 = "H";
            } else
            {
                s1 = "h";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(height));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label5:
        {
            flag2 = flag1;
            if (isDefaultStretch())
            {
                break label5;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!stretchSigned)
                {
                    break label5;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (stretchSigned)
            {
                s1 = "S";
            } else
            {
                s1 = "s";
            }
            stringbuilder.append(s1);
        }
label6:
        {
            flag1 = flag2;
            if (isDefaultHtml())
            {
                break label6;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!htmlSigned)
                {
                    break label6;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (htmlSigned)
            {
                s1 = "H";
            } else
            {
                s1 = "h";
            }
            stringbuilder.append(s1);
        }
label7:
        {
            flag2 = flag1;
            if (isDefaultSmartCrop())
            {
                break label7;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!smartCropSigned)
                {
                    break label7;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (smartCropSigned)
            {
                s1 = "P";
            } else
            {
                s1 = "p";
            }
            stringbuilder.append(s1);
        }
label8:
        {
            flag1 = flag2;
            if (isDefaultSmartCropNoClip())
            {
                break label8;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!smartCropSigned)
                {
                    break label8;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (smartCropNoClipSigned)
            {
                s1 = "Pp";
            } else
            {
                s1 = "pp";
            }
            stringbuilder.append(s1);
        }
label9:
        {
            flag2 = flag1;
            if (isDefaultSmartCropUseFace())
            {
                break label9;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!smartCropSigned)
                {
                    break label9;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (smartCropUseFaceSigned)
            {
                s1 = "Pf";
            } else
            {
                s1 = "pf";
            }
            stringbuilder.append(s1);
        }
label10:
        {
            flag1 = flag2;
            if (isDefaultCenterCrop())
            {
                break label10;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!centerCropSigned)
                {
                    break label10;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (centerCropSigned)
            {
                s1 = "N";
            } else
            {
                s1 = "n";
            }
            stringbuilder.append(s1);
        }
label11:
        {
            flag2 = flag1;
            if (isDefaultRotate())
            {
                break label11;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!rotateSigned)
                {
                    break label11;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (rotateSigned)
            {
                s1 = "R";
            } else
            {
                s1 = String.valueOf(Integer.toString(rotate));
                if (s1.length() != 0)
                {
                    s1 = "r".concat(s1);
                } else
                {
                    s1 = new String("r");
                }
            }
            stringbuilder.append(s1);
        }
label12:
        {
            flag1 = flag2;
            if (isDefaultIgnoreReferer())
            {
                break label12;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!ignoreRefererSigned)
                {
                    break label12;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (ignoreRefererSigned)
            {
                s1 = "R";
            } else
            {
                s1 = "r";
            }
            stringbuilder.append(s1);
        }
label13:
        {
            flag2 = flag1;
            if (isDefaultOverlay())
            {
                break label13;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!overlaySigned)
                {
                    break label13;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (ignoreRefererSigned)
            {
                s1 = "O";
            } else
            {
                s1 = "o";
            }
            stringbuilder.append(s1);
        }
label14:
        {
            flag1 = flag2;
            if (!isDefaultObjectId())
            {
                if (flag2)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag1 = true;
                s1 = String.valueOf(BaseEncoding.base64Url().omitPadding().encode(Longs.toByteArray(objectId)));
                if (s1.length() != 0)
                {
                    s1 = "O".concat(s1);
                } else
                {
                    s1 = new String("O");
                }
                stringbuilder.append(s1);
            }
            flag2 = flag1;
            if (!isDefaultFrameId())
            {
                if (flag1)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag2 = true;
                s1 = String.valueOf(BaseEncoding.base64Url().omitPadding().encode(Longs.toByteArray(frameId)));
                if (s1.length() != 0)
                {
                    s1 = "J".concat(s1);
                } else
                {
                    s1 = new String("J");
                }
                stringbuilder.append(s1);
            }
            flag1 = flag2;
            if (isDefaultTile())
            {
                break label14;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!tileSigned)
                {
                    break label14;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (tileSigned)
            {
                s1 = "X";
            } else
            {
                s1 = String.valueOf(Integer.toString(tileX));
                if (s1.length() != 0)
                {
                    s1 = "x".concat(s1);
                } else
                {
                    s1 = new String("x");
                }
            }
            stringbuilder.append(s1);
            if (tileSigned)
            {
                s1 = "-Y";
            } else
            {
                s1 = String.valueOf(Integer.toString(tileY));
                if (s1.length() != 0)
                {
                    s1 = "-y".concat(s1);
                } else
                {
                    s1 = new String("-y");
                }
            }
            stringbuilder.append(s1);
            if (tileSigned)
            {
                s1 = "-Z";
            } else
            {
                s1 = String.valueOf(Integer.toString(tileZoom));
                if (s1.length() != 0)
                {
                    s1 = "-z".concat(s1);
                } else
                {
                    s1 = new String("-z");
                }
            }
            stringbuilder.append(s1);
        }
label15:
        {
            flag2 = flag1;
            if (isDefaultTileGeneration())
            {
                break label15;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!tileGenerationSigned)
                {
                    break label15;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (tileGenerationSigned)
            {
                s1 = "G";
            } else
            {
                s1 = "g";
            }
            stringbuilder.append(s1);
        }
label16:
        {
            flag1 = flag2;
            if (isDefaultExpirationTime())
            {
                break label16;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!expirationTimeSigned)
                {
                    break label16;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (expirationTimeSigned)
            {
                s1 = "E";
            } else
            {
                s1 = String.valueOf(Integer.toString(expirationTime));
                if (s1.length() != 0)
                {
                    s1 = "e".concat(s1);
                } else
                {
                    s1 = new String("e");
                }
            }
            stringbuilder.append(s1);
        }
label17:
        {
            flag2 = flag1;
            if (isDefaultImageFilter())
            {
                break label17;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!imageFilterSigned)
                {
                    break label17;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (imageFilterSigned)
            {
                s1 = "F";
            } else
            {
                s1 = String.valueOf(imageFilter.replace(';', ':'));
                if (s1.length() != 0)
                {
                    s1 = "f".concat(s1);
                } else
                {
                    s1 = new String("f");
                }
            }
            stringbuilder.append(s1);
        }
label18:
        {
            flag1 = flag2;
            if (isDefaultKillAnimation())
            {
                break label18;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!killAnimationSigned)
                {
                    break label18;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (killAnimationSigned)
            {
                s1 = "K";
            } else
            {
                s1 = "k";
            }
            stringbuilder.append(s1);
        }
label19:
        {
            flag2 = flag1;
            if (!isDefaultUnfiltered())
            {
                if (flag1)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag2 = true;
                stringbuilder.append("U");
            }
            flag1 = flag2;
            if (!isDefaultUnfilteredWithTransforms())
            {
                if (flag2)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag1 = true;
                stringbuilder.append("Ut");
            }
            flag2 = flag1;
            if (!isDefaultIncludeMetadata())
            {
                if (flag1)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag2 = true;
                stringbuilder.append("I");
            }
            flag1 = flag2;
            if (isDefaultEsPortraitApprovedOnly())
            {
                break label19;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!esPortraitApprovedOnlySigned)
                {
                    break label19;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (esPortraitApprovedOnlySigned)
            {
                s1 = "A";
            } else
            {
                s1 = "a";
            }
            stringbuilder.append(s1);
        }
label20:
        {
            flag2 = flag1;
            if (isDefaultBypassTakedown())
            {
                break label20;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!bypassTakedownSigned)
                {
                    break label20;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (bypassTakedownSigned)
            {
                s1 = "B";
            } else
            {
                s1 = "b";
            }
            stringbuilder.append(s1);
        }
label21:
        {
            flag1 = flag2;
            if (!isDefaultBorderSize())
            {
                if (flag2)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag1 = true;
                s1 = String.valueOf(Integer.toString(borderSize));
                if (s1.length() != 0)
                {
                    s1 = "b".concat(s1);
                } else
                {
                    s1 = new String("b");
                }
                stringbuilder.append(s1);
            }
            flag2 = flag1;
            if (hasBorderColor)
            {
                if (flag1)
                {
                    s1 = "-";
                } else
                {
                    s1 = s;
                }
                stringbuilder.append(s1);
                flag2 = true;
                s1 = String.valueOf("c0x");
                s2 = String.valueOf(convertIntToHexStringUnsigned(borderColor));
                if (s2.length() != 0)
                {
                    s1 = s1.concat(s2);
                } else
                {
                    s1 = new String(s1);
                }
                stringbuilder.append(s1);
            }
            flag1 = flag2;
            if (isDefaultQueryString())
            {
                break label21;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!queryStringSigned)
                {
                    break label21;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (queryStringSigned)
            {
                s1 = "Q";
            } else
            {
                s1 = String.valueOf(queryString.replace(';', ':'));
                if (s1.length() != 0)
                {
                    s1 = "q".concat(s1);
                } else
                {
                    s1 = new String("q");
                }
            }
            stringbuilder.append(s1);
        }
label22:
        {
            flag2 = flag1;
            if (isDefaultHorizontalFlip())
            {
                break label22;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!horizontalFlipSigned)
                {
                    break label22;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (horizontalFlipSigned)
            {
                s1 = "Fh";
            } else
            {
                s1 = "fh";
            }
            stringbuilder.append(s1);
        }
label23:
        {
            flag1 = flag2;
            if (isDefaultVerticalFlip())
            {
                break label23;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!verticalFlipSigned)
                {
                    break label23;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (verticalFlipSigned)
            {
                s1 = "Fv";
            } else
            {
                s1 = "fv";
            }
            stringbuilder.append(s1);
        }
label24:
        {
            flag2 = flag1;
            if (isDefaultForceTileGeneration())
            {
                break label24;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!forceTileGeneration)
                {
                    break label24;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (forceTileGenerationSigned)
            {
                s1 = "Fg";
            } else
            {
                s1 = "fg";
            }
            stringbuilder.append(s1);
        }
label25:
        {
            flag1 = flag2;
            if (isDefaultImageCrop())
            {
                break label25;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!imageCropSigned)
                {
                    break label25;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (imageCropSigned)
            {
                s1 = "Ci";
            } else
            {
                s1 = "ci";
            }
            stringbuilder.append(s1);
        }
label26:
        {
            flag2 = flag1;
            if (isDefaultRequestWebp())
            {
                break label26;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!requestWebpSigned)
                {
                    break label26;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (requestWebpSigned)
            {
                s1 = "Rw";
            } else
            {
                s1 = "rw";
            }
            stringbuilder.append(s1);
        }
label27:
        {
            flag1 = flag2;
            if (isDefaultRequestWebpUnlessMaybeTransparent())
            {
                break label27;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!requestWebpUnlessMaybeTransparentSigned)
                {
                    break label27;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (requestWebpUnlessMaybeTransparentSigned)
            {
                s1 = "Rwu";
            } else
            {
                s1 = "rwu";
            }
            stringbuilder.append(s1);
        }
label28:
        {
            flag2 = flag1;
            if (isDefaultRequestAnimatedWebp())
            {
                break label28;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!requestAnimatedWebpSigned)
                {
                    break label28;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (requestAnimatedWebpSigned)
            {
                s1 = "Rwa";
            } else
            {
                s1 = "rwa";
            }
            stringbuilder.append(s1);
        }
label29:
        {
            flag1 = flag2;
            if (isDefaultNoWebp())
            {
                break label29;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!noWebpSigned)
                {
                    break label29;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (noWebpSigned)
            {
                s1 = "Nw";
            } else
            {
                s1 = "nw";
            }
            stringbuilder.append(s1);
        }
label30:
        {
            flag2 = flag1;
            if (isDefaultRequestH264())
            {
                break label30;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!requestH264Signed)
                {
                    break label30;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (requestH264Signed)
            {
                s1 = "Rh";
            } else
            {
                s1 = "rh";
            }
            stringbuilder.append(s1);
        }
label31:
        {
            flag1 = flag2;
            if (isDefaultNoOverlay())
            {
                break label31;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!noOverlaySigned)
                {
                    break label31;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (noOverlaySigned)
            {
                s1 = "No";
            } else
            {
                s1 = "no";
            }
            stringbuilder.append(s1);
        }
label32:
        {
            flag2 = flag1;
            if (isDefaultNoSilhouette())
            {
                break label32;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!noSilhouetteSigned)
                {
                    break label32;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (noSilhouetteSigned)
            {
                s1 = "Ns";
            } else
            {
                s1 = "ns";
            }
            stringbuilder.append(s1);
        }
label33:
        {
            flag1 = flag2;
            if (isDefaultFocusBlur())
            {
                break label33;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!focusBlurSigned)
                {
                    break label33;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (focusBlurSigned)
            {
                s1 = "K";
            } else
            {
                s1 = "k";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(focusBlur));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label34:
        {
            flag2 = flag1;
            if (isDefaultFocalPlane())
            {
                break label34;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!focalPlaneSigned)
                {
                    break label34;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (focalPlaneSigned)
            {
                s1 = "P";
            } else
            {
                s1 = "p";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(focalPlane));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label35:
        {
            flag1 = flag2;
            if (isDefaultQualityLevel())
            {
                break label35;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!qualityLevelSigned)
                {
                    break label35;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (qualityLevelSigned)
            {
                s1 = "L";
            } else
            {
                s1 = "l";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(qualityLevel));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label36:
        {
            flag2 = flag1;
            if (isDefaultQualityBucket())
            {
                break label36;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!qualityBucketSigned)
                {
                    break label36;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (qualityBucketSigned)
            {
                s1 = "V";
            } else
            {
                s1 = "v";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(qualityBucket));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label37:
        {
            flag1 = flag2;
            if (isDefaultNoUpscale())
            {
                break label37;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!noUpscaleSigned)
                {
                    break label37;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (noUpscaleSigned)
            {
                s1 = "Nu";
            } else
            {
                s1 = "nu";
            }
            stringbuilder.append(s1);
        }
label38:
        {
            flag2 = flag1;
            if (isDefaultForceTransformation())
            {
                break label38;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!forceTransformation)
                {
                    break label38;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (forceTransformationSigned)
            {
                s1 = "Ft";
            } else
            {
                s1 = "ft";
            }
            stringbuilder.append(s1);
        }
label39:
        {
            flag1 = flag2;
            if (isDefaultCircleCrop())
            {
                break label39;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!circleCropSigned)
                {
                    break label39;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (circleCropSigned)
            {
                s1 = "Cc";
            } else
            {
                s1 = "cc";
            }
            stringbuilder.append(s1);
        }
label40:
        {
            flag2 = flag1;
            if (isDefaultNoDefaultImage())
            {
                break label40;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!noDefaultImageSigned)
                {
                    break label40;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (noDefaultImageSigned)
            {
                s1 = "Nd";
            } else
            {
                s1 = "nd";
            }
            stringbuilder.append(s1);
        }
label41:
        {
            flag1 = flag2;
            if (isDefaultIncludePublicMetadata())
            {
                break label41;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!includePublicMetadataSigned)
                {
                    break label41;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (includePublicMetadataSigned)
            {
                s1 = "Ip";
            } else
            {
                s1 = "ip";
            }
            stringbuilder.append(s1);
        }
label42:
        {
            flag2 = flag1;
            if (isDefaultNoCorrectExifOrientation())
            {
                break label42;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!noCorrectExifOrientationSigned)
                {
                    break label42;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (noCorrectExifOrientationSigned)
            {
                s1 = "Nc";
            } else
            {
                s1 = "nc";
            }
            stringbuilder.append(s1);
        }
label43:
        {
            flag1 = flag2;
            if (isDefaultSelectFrameNumber())
            {
                break label43;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!selectFrameNumberSigned)
                {
                    break label43;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (selectFrameNumberSigned)
            {
                s1 = "A";
            } else
            {
                s1 = "a";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(selectFrameNumber));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label44:
        {
            flag2 = flag1;
            if (isDefaultRequestJpeg())
            {
                break label44;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!requestJpegSigned)
                {
                    break label44;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (requestJpegSigned)
            {
                s1 = "Rj";
            } else
            {
                s1 = "rj";
            }
            stringbuilder.append(s1);
        }
label45:
        {
            flag1 = flag2;
            if (isDefaultRequestPng())
            {
                break label45;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!requestPngSigned)
                {
                    break label45;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (requestPngSigned)
            {
                s1 = "Rp";
            } else
            {
                s1 = "rp";
            }
            stringbuilder.append(s1);
        }
label46:
        {
            flag2 = flag1;
            if (isDefaultRequestGif())
            {
                break label46;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!requestGifSigned)
                {
                    break label46;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (requestGifSigned)
            {
                s1 = "Rg";
            } else
            {
                s1 = "rg";
            }
            stringbuilder.append(s1);
        }
label47:
        {
            flag1 = flag2;
            if (isDefaultPad())
            {
                break label47;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!padSigned)
                {
                    break label47;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (padSigned)
            {
                s1 = "Pd";
            } else
            {
                s1 = "pd";
            }
            stringbuilder.append(s1);
        }
label48:
        {
            flag2 = flag1;
            if (isDefaultPreserveAspectRatio())
            {
                break label48;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!preserveAspectRatioSigned)
                {
                    break label48;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (preserveAspectRatioSigned)
            {
                s1 = "Pa";
            } else
            {
                s1 = "pa";
            }
            stringbuilder.append(s1);
        }
label49:
        {
            flag1 = flag2;
            if (isDefaultVideoFormat())
            {
                break label49;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!videoFormatSigned)
                {
                    break label49;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (videoFormatSigned)
            {
                s1 = "M";
            } else
            {
                s1 = "m";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Integer.toString(videoFormat));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label50:
        {
            flag2 = flag1;
            if (isDefaultVideoBegin())
            {
                break label50;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!videoBeginSigned)
                {
                    break label50;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (videoBeginSigned)
            {
                s1 = "Vb";
            } else
            {
                s1 = "vb";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Long.toString(videoBegin));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label51:
        {
            flag1 = flag2;
            if (isDefaultVideoLength())
            {
                break label51;
            }
            if (flag)
            {
                flag1 = flag2;
                if (!videoLengthSigned)
                {
                    break label51;
                }
            }
            if (flag2)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag1 = true;
            if (videoLengthSigned)
            {
                s1 = "Vl";
            } else
            {
                s1 = "vl";
            }
            s1 = String.valueOf(s1);
            s2 = String.valueOf(Long.toString(videoLength));
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            stringbuilder.append(s1);
        }
label52:
        {
            flag2 = flag1;
            if (isDefaultLooseFaceCrop())
            {
                break label52;
            }
            if (flag)
            {
                flag2 = flag1;
                if (!looseFaceCropSigned)
                {
                    break label52;
                }
            }
            if (flag1)
            {
                s1 = "-";
            } else
            {
                s1 = s;
            }
            stringbuilder.append(s1);
            flag2 = true;
            if (looseFaceCropSigned)
            {
                s1 = "Lf";
            } else
            {
                s1 = "lf";
            }
            stringbuilder.append(s1);
        }
        if (!isDefaultMatchVersion() && (!flag || matchVersionSigned))
        {
            if (flag2)
            {
                s = "-";
            }
            stringbuilder.append(s);
            if (matchVersionSigned)
            {
                s = "Mv";
            } else
            {
                s = "mv";
            }
            stringbuilder.append(s);
        }
        return stringbuilder.toString();
    }
}
