.class public final Lcom/mixpanel/android/mpmetrics/k;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClickableViewAccessibility"
    }
.end annotation

.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/k$a;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/view/GestureDetector;

.field private c:Landroid/os/Handler;

.field private d:I

.field private e:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

.field private f:Ljava/lang/Runnable;

.field private g:Ljava/lang/Runnable;

.field private h:Landroid/view/View;

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 234
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 206
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/k;->i:Z

    if-nez v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 208
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 209
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/k;->d:I

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->a(I)V

    .line 211
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    .line 212
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 213
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 216
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/k;->i:Z

    .line 217
    return-void
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/k;)V
    .locals 3

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/k;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Lcom/mixpanel/android/a$a;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->setCustomAnimations(II)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/k;->i:Z

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/View;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->h:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lcom/mixpanel/android/mpmetrics/k;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->e:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    return-object v0
.end method

.method static synthetic d(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/GestureDetector;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->b:Landroid/view/GestureDetector;

    return-object v0
.end method

.method static synthetic e(Lcom/mixpanel/android/mpmetrics/k;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->a:Landroid/app/Activity;

    return-object v0
.end method


# virtual methods
.method public final a(ILcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;)V
    .locals 0

    .prologue
    .line 46
    iput p1, p0, Lcom/mixpanel/android/mpmetrics/k;->d:I

    .line 47
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/k;->e:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    .line 48
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 52
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 56
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/k;->a:Landroid/app/Activity;

    .line 57
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    .line 58
    new-instance v0, Lcom/mixpanel/android/mpmetrics/l;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/l;-><init>(Lcom/mixpanel/android/mpmetrics/k;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->f:Ljava/lang/Runnable;

    .line 63
    new-instance v0, Lcom/mixpanel/android/mpmetrics/m;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/m;-><init>(Lcom/mixpanel/android/mpmetrics/k;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->g:Ljava/lang/Runnable;

    .line 91
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/mixpanel/android/mpmetrics/o;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/mpmetrics/o;-><init>(Lcom/mixpanel/android/mpmetrics/k;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->b:Landroid/view/GestureDetector;

    .line 144
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 148
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/k;->i:Z

    .line 150
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 154
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 156
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->e:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    if-nez v0, :cond_0

    .line 157
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/k;->a()V

    .line 171
    :goto_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->h:Landroid/view/View;

    return-object v0

    .line 159
    :cond_0
    sget v0, Lcom/mixpanel/android/a$d;->b:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->h:Landroid/view/View;

    .line 160
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->h:Landroid/view/View;

    sget v1, Lcom/mixpanel/android/a$c;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 161
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->h:Landroid/view/View;

    sget v2, Lcom/mixpanel/android/a$c;->i:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 163
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/k;->e:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->c()Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v2

    .line 165
    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->j()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 168
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->f:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1770

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public final onPause()V
    .locals 0

    .prologue
    .line 201
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 202
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/k;->a()V

    .line 203
    return-void
.end method

.method public final onResume()V
    .locals 4

    .prologue
    .line 185
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 190
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/k;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 191
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 195
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/k;->a()V

    .line 196
    invoke-super {p0, p1}, Landroid/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 197
    return-void
.end method

.method public final onStart()V
    .locals 1

    .prologue
    .line 176
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 178
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/k;->i:Z

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/k;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 181
    :cond_0
    return-void
.end method
