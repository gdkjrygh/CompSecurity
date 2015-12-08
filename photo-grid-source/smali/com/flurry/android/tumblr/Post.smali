.class public abstract Lcom/flurry/android/tumblr/Post;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static g:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/flurry/android/tumblr/PostListener;

.field private f:I

.field private final h:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/dz;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 27
    const-class v0, Lcom/flurry/android/tumblr/Post;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/android/tumblr/Post;->a:Ljava/lang/String;

    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/flurry/android/tumblr/Post;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method constructor <init>()V
    .locals 3

    .prologue
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/flurry/android/tumblr/Post;->f:I

    .line 38
    new-instance v0, Lcom/flurry/android/tumblr/Post$1;

    invoke-direct {v0, p0}, Lcom/flurry/android/tumblr/Post$1;-><init>(Lcom/flurry/android/tumblr/Post;)V

    iput-object v0, p0, Lcom/flurry/android/tumblr/Post;->h:Lcom/flurry/sdk/jx;

    .line 89
    sget-object v0, Lcom/flurry/android/tumblr/Post;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, Lcom/flurry/android/tumblr/Post;->f:I

    .line 90
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.impl.analytics.tumblr.TumblrEvents"

    iget-object v2, p0, Lcom/flurry/android/tumblr/Post;->h:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 91
    return-void
.end method

.method static synthetic a(Lcom/flurry/android/tumblr/Post;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/flurry/android/tumblr/Post;->f:I

    return v0
.end method

.method static synthetic b(Lcom/flurry/android/tumblr/Post;)Lcom/flurry/android/tumblr/PostListener;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post;->e:Lcom/flurry/android/tumblr/PostListener;

    return-object v0
.end method

.method static synthetic c(Lcom/flurry/android/tumblr/Post;)Lcom/flurry/sdk/jx;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post;->h:Lcom/flurry/sdk/jx;

    return-object v0
.end method

.method static synthetic h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/flurry/android/tumblr/Post;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method abstract c()Landroid/os/Bundle;
.end method

.method d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post;->c:Ljava/lang/String;

    return-object v0
.end method

.method e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post;->b:Ljava/lang/String;

    return-object v0
.end method

.method f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post;->d:Ljava/lang/String;

    return-object v0
.end method

.method g()I
    .locals 1

    .prologue
    .line 151
    iget v0, p0, Lcom/flurry/android/tumblr/Post;->f:I

    return v0
.end method

.method public setAndroidDeeplink(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/flurry/android/tumblr/Post;->c:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setIOSDeepLink(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/flurry/android/tumblr/Post;->b:Ljava/lang/String;

    .line 113
    return-void
.end method

.method public setPostListener(Lcom/flurry/android/tumblr/PostListener;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/flurry/android/tumblr/Post;->e:Lcom/flurry/android/tumblr/PostListener;

    .line 136
    return-void
.end method

.method public setWebLink(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/flurry/android/tumblr/Post;->d:Ljava/lang/String;

    .line 124
    return-void
.end method
