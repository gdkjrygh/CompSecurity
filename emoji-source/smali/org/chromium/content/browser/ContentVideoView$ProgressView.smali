.class Lorg/chromium/content/browser/ContentVideoView$ProgressView;
.super Landroid/widget/LinearLayout;
.source "ContentVideoView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/ContentVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ProgressView"
.end annotation


# instance fields
.field private final mProgressBar:Landroid/widget/ProgressBar;

.field private final mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "videoLoadingText"    # Ljava/lang/String;

    .prologue
    const/4 v1, -0x2

    .line 154
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->setOrientation(I)V

    .line 156
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    new-instance v0, Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    const v2, 0x101007a

    invoke-direct {v0, p1, v1, v2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->mProgressBar:Landroid/widget/ProgressBar;

    .line 160
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->mTextView:Landroid/widget/TextView;

    .line 161
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->mProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->addView(Landroid/view/View;)V

    .line 163
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView$ProgressView;->addView(Landroid/view/View;)V

    .line 164
    return-void
.end method
