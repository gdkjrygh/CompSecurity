.class public final Lcom/bumptech/glide/d/q;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/bumptech/glide/p;

.field private final b:Lcom/bumptech/glide/d/a;

.field private final c:Lcom/bumptech/glide/d/o;

.field private final d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/bumptech/glide/d/q;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/bumptech/glide/d/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lcom/bumptech/glide/d/a;

    invoke-direct {v0}, Lcom/bumptech/glide/d/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/d/q;-><init>(Lcom/bumptech/glide/d/a;)V

    .line 36
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
    .line 40
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 28
    new-instance v0, Lcom/bumptech/glide/d/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/bumptech/glide/d/r;-><init>(Lcom/bumptech/glide/d/q;B)V

    iput-object v0, p0, Lcom/bumptech/glide/d/q;->c:Lcom/bumptech/glide/d/o;

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/d/q;->d:Ljava/util/HashSet;

    .line 41
    iput-object p1, p0, Lcom/bumptech/glide/d/q;->b:Lcom/bumptech/glide/d/a;

    .line 42
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->e:Lcom/bumptech/glide/d/q;

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->e:Lcom/bumptech/glide/d/q;

    .line 1077
    iget-object v0, v0, Lcom/bumptech/glide/d/q;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/d/q;->e:Lcom/bumptech/glide/d/q;

    .line 130
    :cond_0
    return-void
.end method


# virtual methods
.method final a()Lcom/bumptech/glide/d/a;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->b:Lcom/bumptech/glide/d/a;

    return-object v0
.end method

.method public final a(Lcom/bumptech/glide/p;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/bumptech/glide/d/q;->a:Lcom/bumptech/glide/p;

    .line 51
    return-void
.end method

.method public final b()Lcom/bumptech/glide/p;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->a:Lcom/bumptech/glide/p;

    return-object v0
.end method

.method public final c()Lcom/bumptech/glide/d/o;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->c:Lcom/bumptech/glide/d/o;

    return-object v0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 134
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 136
    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/d/q;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 1117
    invoke-direct {p0}, Lcom/bumptech/glide/d/q;->d()V

    .line 1118
    invoke-static {}, Lcom/bumptech/glide/d/n;->a()Lcom/bumptech/glide/d/n;

    move-result-object v1

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/d/n;->a(Landroid/support/v4/app/FragmentManager;)Lcom/bumptech/glide/d/q;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/d/q;->e:Lcom/bumptech/glide/d/q;

    .line 1120
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->e:Lcom/bumptech/glide/d/q;

    if-eq v0, p0, :cond_0

    .line 1121
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->e:Lcom/bumptech/glide/d/q;

    .line 2073
    iget-object v0, v0, Lcom/bumptech/glide/d/q;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :cond_0
    :goto_0
    return-void

    .line 137
    :catch_0
    move-exception v0

    .line 139
    const-string v1, "SupportRMFragment"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 140
    const-string v1, "SupportRMFragment"

    const-string v2, "Unable to register fragment with root"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final onDestroy()V
    .locals 1

    .prologue
    .line 165
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 166
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->b:Lcom/bumptech/glide/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/d/a;->c()V

    .line 167
    return-void
.end method

.method public final onDetach()V
    .locals 0

    .prologue
    .line 147
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 148
    invoke-direct {p0}, Lcom/bumptech/glide/d/q;->d()V

    .line 149
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .prologue
    .line 171
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onLowMemory()V

    .line 174
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->a:Lcom/bumptech/glide/p;

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->a:Lcom/bumptech/glide/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/p;->a()V

    .line 177
    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    .prologue
    .line 153
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 154
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->b:Lcom/bumptech/glide/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/d/a;->a()V

    .line 155
    return-void
.end method

.method public final onStop()V
    .locals 1

    .prologue
    .line 159
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 160
    iget-object v0, p0, Lcom/bumptech/glide/d/q;->b:Lcom/bumptech/glide/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/d/a;->b()V

    .line 161
    return-void
.end method
