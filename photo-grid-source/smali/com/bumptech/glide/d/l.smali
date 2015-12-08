.class public final Lcom/bumptech/glide/d/l;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/d/a;

.field private final b:Lcom/bumptech/glide/d/o;

.field private c:Lcom/bumptech/glide/p;

.field private final d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/bumptech/glide/d/l;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/bumptech/glide/d/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    new-instance v0, Lcom/bumptech/glide/d/a;

    invoke-direct {v0}, Lcom/bumptech/glide/d/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/d/l;-><init>(Lcom/bumptech/glide/d/a;)V

    .line 38
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/d/a;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 30
    new-instance v0, Lcom/bumptech/glide/d/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/bumptech/glide/d/m;-><init>(Lcom/bumptech/glide/d/l;B)V

    iput-object v0, p0, Lcom/bumptech/glide/d/l;->b:Lcom/bumptech/glide/d/o;

    .line 32
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/d/l;->d:Ljava/util/HashSet;

    .line 43
    iput-object p1, p0, Lcom/bumptech/glide/d/l;->a:Lcom/bumptech/glide/d/a;

    .line 44
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->e:Lcom/bumptech/glide/d/l;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->e:Lcom/bumptech/glide/d/l;

    .line 1075
    iget-object v0, v0, Lcom/bumptech/glide/d/l;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/d/l;->e:Lcom/bumptech/glide/d/l;

    .line 131
    :cond_0
    return-void
.end method


# virtual methods
.method final a()Lcom/bumptech/glide/d/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->a:Lcom/bumptech/glide/d/a;

    return-object v0
.end method

.method public final a(Lcom/bumptech/glide/p;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/bumptech/glide/d/l;->c:Lcom/bumptech/glide/p;

    .line 53
    return-void
.end method

.method public final b()Lcom/bumptech/glide/p;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->c:Lcom/bumptech/glide/p;

    return-object v0
.end method

.method public final c()Lcom/bumptech/glide/d/o;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->b:Lcom/bumptech/glide/d/o;

    return-object v0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 135
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 1118
    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/d/l;->d()V

    .line 1119
    invoke-static {}, Lcom/bumptech/glide/d/n;->a()Lcom/bumptech/glide/d/n;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/d/n;->a(Landroid/app/FragmentManager;)Lcom/bumptech/glide/d/l;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/d/l;->e:Lcom/bumptech/glide/d/l;

    .line 1121
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->e:Lcom/bumptech/glide/d/l;

    if-eq v0, p0, :cond_0

    .line 1122
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->e:Lcom/bumptech/glide/d/l;

    .line 2071
    iget-object v0, v0, Lcom/bumptech/glide/d/l;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    :cond_0
    :goto_0
    return-void

    .line 138
    :catch_0
    move-exception v0

    .line 140
    const-string v1, "RMFragment"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 141
    const-string v1, "RMFragment"

    const-string v2, "Unable to register fragment with root"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final onDestroy()V
    .locals 1

    .prologue
    .line 166
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 167
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->a:Lcom/bumptech/glide/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/d/a;->c()V

    .line 168
    return-void
.end method

.method public final onDetach()V
    .locals 0

    .prologue
    .line 148
    invoke-super {p0}, Landroid/app/Fragment;->onDetach()V

    .line 149
    invoke-direct {p0}, Lcom/bumptech/glide/d/l;->d()V

    .line 150
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->c:Lcom/bumptech/glide/p;

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->c:Lcom/bumptech/glide/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/p;->a()V

    .line 186
    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    .prologue
    .line 154
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 155
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->a:Lcom/bumptech/glide/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/d/a;->a()V

    .line 156
    return-void
.end method

.method public final onStop()V
    .locals 1

    .prologue
    .line 160
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 161
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->a:Lcom/bumptech/glide/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/d/a;->b()V

    .line 162
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->c:Lcom/bumptech/glide/p;

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/bumptech/glide/d/l;->c:Lcom/bumptech/glide/p;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/p;->a(I)V

    .line 177
    :cond_0
    return-void
.end method
