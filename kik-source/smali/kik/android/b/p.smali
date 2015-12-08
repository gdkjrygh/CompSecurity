.class final Lkik/android/b/p;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/b/o;


# direct methods
.method constructor <init>(Lkik/android/b/o;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lkik/android/b/p;->a:Lkik/android/b/o;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lkik/android/b/p;->a:Lkik/android/b/o;

    iget-object v0, v0, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v0, v0, Lkik/android/b/n;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 167
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 134
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    const-string v0, "kik.permissionFragment.extra.returned.userdata"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/util/UserDataParcelable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/b/p;->a:Lkik/android/b/o;

    iget-object v1, v1, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v1, v1, Lkik/android/b/n;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/b/p;->a:Lkik/android/b/o;

    iget-object v0, v0, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v0, v0, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v0}, Lkik/android/b/m;->c(Lkik/android/b/m;)Lkik/android/b/s;

    move-result-object v0

    iget-object v1, p0, Lkik/android/b/p;->a:Lkik/android/b/o;

    iget-object v1, v1, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v1, v1, Lkik/android/b/n;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/b/s;->g(Ljava/lang/String;)Lcom/kik/g/p;

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lkik/android/b/p;->d()V

    goto :goto_0
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 160
    invoke-super {p0}, Lcom/kik/g/r;->b()V

    .line 161
    invoke-direct {p0}, Lkik/android/b/p;->d()V

    .line 162
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 153
    invoke-super {p0, p1}, Lcom/kik/g/r;->b(Ljava/lang/Throwable;)V

    .line 154
    iget-object v0, p0, Lkik/android/b/p;->a:Lkik/android/b/o;

    iget-object v0, v0, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v0, v0, Lkik/android/b/n;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 155
    return-void
.end method
