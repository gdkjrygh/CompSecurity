.class public Lcom/facebook/reflex/j;
.super Lcom/facebook/reflex/ReflexActivity;
.source "FragmentReflexActivity.java"

# interfaces
.implements Lcom/facebook/base/h;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# static fields
.field private static final g:[I

.field private static final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Lcom/facebook/reflex/m;

.field protected b:Landroid/view/View;

.field private final c:Lcom/facebook/base/i;

.field private d:Landroid/support/v4/app/bb;

.field private e:Lcom/facebook/reflex/view/b/p;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 60
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/facebook/d;->reflexAware:I

    aput v2, v0, v1

    sput-object v0, Lcom/facebook/reflex/j;->g:[I

    .line 62
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    .line 64
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/h;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/a/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Landroid/view/View;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Landroid/view/View;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Landroid/widget/ScrollView;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/p;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Landroid/widget/Button;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/g;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/d;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/o;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    const-class v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/reflex/view/e;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/reflex/ReflexActivity;-><init>()V

    .line 51
    new-instance v0, Lcom/facebook/base/i;

    invoke-direct {v0}, Lcom/facebook/base/i;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/j;->c:Lcom/facebook/base/i;

    .line 286
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/j;)Lcom/facebook/reflex/view/b/p;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/reflex/j;->e:Lcom/facebook/reflex/view/b/p;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 283
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/reflex/j;->c:Lcom/facebook/base/i;

    invoke-virtual {v0, p1}, Lcom/facebook/base/i;->a(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 205
    sget-object v0, Lcom/facebook/reflex/j;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 159
    return-void
.end method

.method public a(Landroid/view/ViewGroup;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 261
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/ReflexActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 262
    return-void
.end method

.method public a(Lcom/facebook/reflex/view/b/r;)V
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/facebook/reflex/j;->e:Lcom/facebook/reflex/view/b/p;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/p;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 165
    iget-object v0, p0, Lcom/facebook/reflex/j;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 167
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/facebook/reflex/j;->c:Lcom/facebook/base/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    return-void
.end method

.method public a(Ljava/util/EnumSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/reflex/view/b/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/m;->setAndroidTouchMode(Ljava/util/EnumSet;)V

    .line 153
    return-void
.end method

.method protected final a(Landroid/content/Context;Landroid/util/AttributeSet;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 198
    sget-object v0, Lcom/facebook/reflex/j;->g:[I

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 199
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 200
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 201
    return v1
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 255
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/m;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 256
    return-void
.end method

.method public f()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->r()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 171
    invoke-super {p0}, Lcom/facebook/reflex/ReflexActivity;->onAttachedToWindow()V

    .line 172
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/j;->f:Z

    .line 174
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->l()V

    .line 175
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const v3, 0x1020002

    const/4 v2, -0x1

    .line 93
    invoke-super {p0, p1}, Lcom/facebook/reflex/ReflexActivity;->onCreate(Landroid/os/Bundle;)V

    .line 94
    invoke-virtual {p0}, Lcom/facebook/reflex/j;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->takeSurface(Landroid/view/SurfaceHolder$Callback2;)V

    .line 95
    new-instance v0, Lcom/facebook/reflex/view/b/p;

    invoke-direct {v0, p0}, Lcom/facebook/reflex/view/b/p;-><init>(Lcom/facebook/reflex/j;)V

    iput-object v0, p0, Lcom/facebook/reflex/j;->e:Lcom/facebook/reflex/view/b/p;

    .line 105
    new-instance v0, Lcom/facebook/reflex/m;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/m;-><init>(Lcom/facebook/reflex/j;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    .line 106
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-super {p0, v0, v1}, Lcom/facebook/reflex/ReflexActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-static {v0}, Lcom/facebook/reflex/m;->a(Lcom/facebook/reflex/m;)Landroid/view/SurfaceView;

    move-result-object v0

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-super {p0, v0, v1}, Lcom/facebook/reflex/ReflexActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/m;->a()Lcom/facebook/reflex/Widget;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/Widget;)V

    .line 114
    new-instance v0, Lcom/facebook/reflex/k;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/k;-><init>(Lcom/facebook/reflex/j;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/reflex/j;->b:Landroid/view/View;

    .line 122
    iget-object v0, p0, Lcom/facebook/reflex/j;->b:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-super {p0, v0, v1}, Lcom/facebook/reflex/ReflexActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    invoke-virtual {p0}, Lcom/facebook/reflex/j;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    if-nez v0, :cond_0

    .line 127
    invoke-virtual {p0}, Lcom/facebook/reflex/j;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 131
    :cond_0
    new-instance v1, Lcom/facebook/reflex/l;

    invoke-virtual {p0}, Lcom/facebook/reflex/j;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {v1, p0, v0}, Lcom/facebook/reflex/l;-><init>(Lcom/facebook/reflex/j;Landroid/view/ViewGroup;)V

    iput-object v1, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    .line 142
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->k()V

    .line 146
    invoke-virtual {p0, v3}, Lcom/facebook/reflex/j;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 147
    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 148
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0, v3}, Lcom/facebook/reflex/m;->setId(I)V

    .line 149
    return-void
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 210
    const-string v1, "fragment"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 211
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/bb;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 228
    :cond_0
    :goto_0
    return-object v0

    .line 214
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/facebook/reflex/j;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 215
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 216
    if-nez v1, :cond_2

    .line 217
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to find a reflex substitute for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " element. Make sure the class names are valid."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 221
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/reflex/j;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p3}, Landroid/view/LayoutInflater;->createView(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 222
    :catch_0
    move-exception v0

    .line 223
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to create an instance of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " while trying to replace "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 179
    invoke-super {p0}, Lcom/facebook/reflex/ReflexActivity;->onDetachedFromWindow()V

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/j;->f:Z

    .line 182
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->q()V

    .line 183
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 277
    invoke-super {p0}, Lcom/facebook/reflex/ReflexActivity;->onPause()V

    .line 278
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->o()V

    .line 279
    return-void
.end method

.method protected onPostResume()V
    .locals 1

    .prologue
    .line 271
    invoke-super {p0}, Lcom/facebook/reflex/ReflexActivity;->onPostResume()V

    .line 272
    iget-object v0, p0, Lcom/facebook/reflex/j;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->n()V

    .line 273
    return-void
.end method

.method public setContentView(I)V
    .locals 2

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/m;->g()V

    .line 234
    invoke-virtual {p0}, Lcom/facebook/reflex/j;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 235
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    if-nez v0, :cond_0

    .line 245
    :goto_0
    return-void

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/m;->addView(Landroid/view/View;)V

    goto :goto_0
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/m;->g()V

    .line 250
    iget-object v0, p0, Lcom/facebook/reflex/j;->a:Lcom/facebook/reflex/m;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/m;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    return-void
.end method
