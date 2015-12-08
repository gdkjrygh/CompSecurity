// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;
import kik.android.widget.AspectRatioImageView;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment, g, h, i, 
//            j

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, CameraFragment camerafragment, Object obj)
    {
        View view = viewinjector.ViewInjector(obj, 0x7f0e00b9);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624121' for field '_shutterButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._shutterButton = view;
        view = viewinjector._shutterButton(obj, 0x7f0e00b8);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624120' for field '_retakeButton' and method 'retakePhoto' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._retakeButton = view;
        view.setOnClickListener(new g(camerafragment));
        view = viewinjector._retakeButton(obj, 0x7f0e00bc);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624124' for field '_swapCameraButton' and method 'switchCamera' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._swapCameraButton = view;
        view.setOnClickListener(new h(camerafragment));
        view = viewinjector._swapCameraButton(obj, 0x7f0e00bb);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624123' for field '_lightingButton' and method 'changeFlashMode' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._lightingButton = (ImageView)view;
        view.setOnClickListener(new i(camerafragment));
        view = viewinjector._lightingButton(obj, 0x7f0e00ba);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624122' for field '_usePhotoButton' and method 'usePhoto' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._usePhotoButton = view;
        view.setOnClickListener(new j(camerafragment));
        view = viewinjector._usePhotoButton(obj, 0x7f0e00b3);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624115' for field '_touchFocusImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._touchFocusImage = (FrameLayout)view;
        view = viewinjector._touchFocusImage(obj, 0x7f0e00ae);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624110' for field '_liveCameraContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._liveCameraContainer = view;
        view = viewinjector._liveCameraContainer(obj, 0x7f0e00b4);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624116' for field '_previewContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._previewContainer = view;
        view = viewinjector._previewContainer(obj, 0x7f0e00b7);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624119' for field '_cameraShutterBar' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._cameraShutterBar = view;
        view = viewinjector._cameraShutterBar(obj, 0x7f0e00b5);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624117' for field '_previewImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._previewImage = (AspectRatioImageView)view;
        view = viewinjector._previewImage(obj, 0x7f0e00b0);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624112' for field '_cameraCover' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._cameraCover = view;
        view = viewinjector._cameraCover(obj, 0x7f0e00b1);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624113' for field '_shadeCover' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._shadeCover = view;
        view = viewinjector._shadeCover(obj, 0x7f0e00be);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624126' for field '_cameraErrorCover' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._cameraErrorCover = view;
        view = viewinjector._cameraErrorCover(obj, 0x7f0e00b6);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624118' for field '_videoView' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._videoView = (VideoView)view;
        view = viewinjector._videoView(obj, 0x7f0e00bf);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624127' for field '_videoProgress' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._videoProgress = (ProgressBar)view;
        view = viewinjector._videoProgress(obj, 0x7f0e00bd);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624125' for field '_videoTime' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._videoTime = (TextView)view;
        view = viewinjector._videoTime(obj, 0x7f0e00af);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624111' for field '_clipFrame' was not found. If this view is optional add '@Optional' annotation.");
        }
        camerafragment._clipFrame = (FrameLayout)view;
        viewinjector = viewinjector._clipFrame(obj, 0x7f0e00b2);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624114' for field '_videoInstructionText' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            camerafragment._videoInstructionText = (TextView)viewinjector;
            return;
        }
    }

    public static void reset(CameraFragment camerafragment)
    {
        camerafragment._shutterButton = null;
        camerafragment._retakeButton = null;
        camerafragment._swapCameraButton = null;
        camerafragment._lightingButton = null;
        camerafragment._usePhotoButton = null;
        camerafragment._touchFocusImage = null;
        camerafragment._liveCameraContainer = null;
        camerafragment._previewContainer = null;
        camerafragment._cameraShutterBar = null;
        camerafragment._previewImage = null;
        camerafragment._cameraCover = null;
        camerafragment._shadeCover = null;
        camerafragment._cameraErrorCover = null;
        camerafragment._videoView = null;
        camerafragment._videoProgress = null;
        camerafragment._videoTime = null;
        camerafragment._clipFrame = null;
        camerafragment._videoInstructionText = null;
    }

    public ()
    {
    }
}
