.class public Lkik/android/chat/fragment/CameraFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/CameraFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e00b9

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624121\' for field \'_shutterButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    .line 15
    const v0, 0x7f0e00b8

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624120\' for field \'_retakeButton\' and method \'retakePhoto\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    .line 20
    new-instance v1, Lkik/android/chat/fragment/g;

    invoke-direct {v1, p1}, Lkik/android/chat/fragment/g;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    const v0, 0x7f0e00bc

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624124\' for field \'_swapCameraButton\' and method \'switchCamera\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_2
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    .line 33
    new-instance v1, Lkik/android/chat/fragment/h;

    invoke-direct {v1, p1}, Lkik/android/chat/fragment/h;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    const v0, 0x7f0e00bb

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 42
    if-nez v1, :cond_3

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624123\' for field \'_lightingButton\' and method \'changeFlashMode\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object v0, v1

    .line 45
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    .line 46
    new-instance v0, Lkik/android/chat/fragment/i;

    invoke-direct {v0, p1}, Lkik/android/chat/fragment/i;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    const v0, 0x7f0e00ba

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 55
    if-nez v0, :cond_4

    .line 56
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624122\' for field \'_usePhotoButton\' and method \'usePhoto\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_4
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    .line 59
    new-instance v1, Lkik/android/chat/fragment/j;

    invoke-direct {v1, p1}, Lkik/android/chat/fragment/j;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    const v0, 0x7f0e00b3

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 68
    if-nez v0, :cond_5

    .line 69
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624115\' for field \'_touchFocusImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_5
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    .line 72
    const v0, 0x7f0e00ae

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 73
    if-nez v0, :cond_6

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624110\' for field \'_liveCameraContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_6
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_liveCameraContainer:Landroid/view/View;

    .line 77
    const v0, 0x7f0e00b4

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624116\' for field \'_previewContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_7
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    .line 82
    const v0, 0x7f0e00b7

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 83
    if-nez v0, :cond_8

    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624119\' for field \'_cameraShutterBar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_8
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_cameraShutterBar:Landroid/view/View;

    .line 87
    const v0, 0x7f0e00b5

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 88
    if-nez v0, :cond_9

    .line 89
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624117\' for field \'_previewImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_9
    check-cast v0, Lkik/android/widget/AspectRatioImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_previewImage:Lkik/android/widget/AspectRatioImageView;

    .line 92
    const v0, 0x7f0e00b0

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 93
    if-nez v0, :cond_a

    .line 94
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624112\' for field \'_cameraCover\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_a
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_cameraCover:Landroid/view/View;

    .line 97
    const v0, 0x7f0e00b1

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 98
    if-nez v0, :cond_b

    .line 99
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624113\' for field \'_shadeCover\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_b
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    .line 102
    const v0, 0x7f0e00be

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 103
    if-nez v0, :cond_c

    .line 104
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624126\' for field \'_cameraErrorCover\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_c
    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_cameraErrorCover:Landroid/view/View;

    .line 107
    const v0, 0x7f0e00b6

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 108
    if-nez v0, :cond_d

    .line 109
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624118\' for field \'_videoView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :cond_d
    check-cast v0, Landroid/widget/VideoView;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    .line 112
    const v0, 0x7f0e00bf

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 113
    if-nez v0, :cond_e

    .line 114
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624127\' for field \'_videoProgress\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_e
    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    .line 117
    const v0, 0x7f0e00bd

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 118
    if-nez v0, :cond_f

    .line 119
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624125\' for field \'_videoTime\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_f
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    .line 122
    const v0, 0x7f0e00af

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 123
    if-nez v0, :cond_10

    .line 124
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624111\' for field \'_clipFrame\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_10
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    .line 127
    const v0, 0x7f0e00b2

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 128
    if-nez v0, :cond_11

    .line 129
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624114\' for field \'_videoInstructionText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_11
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/CameraFragment;->_videoInstructionText:Landroid/widget/TextView;

    .line 132
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    .line 136
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    .line 137
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    .line 138
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    .line 139
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    .line 140
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    .line 141
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_liveCameraContainer:Landroid/view/View;

    .line 142
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    .line 143
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraShutterBar:Landroid/view/View;

    .line 144
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_previewImage:Lkik/android/widget/AspectRatioImageView;

    .line 145
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraCover:Landroid/view/View;

    .line 146
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    .line 147
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraErrorCover:Landroid/view/View;

    .line 148
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    .line 149
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    .line 150
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    .line 151
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    .line 152
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoInstructionText:Landroid/widget/TextView;

    .line 153
    return-void
.end method
