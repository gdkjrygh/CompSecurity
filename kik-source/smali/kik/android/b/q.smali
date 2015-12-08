.class final Lkik/android/b/q;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/android/b/m;


# direct methods
.method constructor <init>(Lkik/android/b/m;Ljava/util/List;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lkik/android/b/q;->c:Lkik/android/b/m;

    iput-object p2, p0, Lkik/android/b/q;->a:Ljava/util/List;

    iput-object p3, p0, Lkik/android/b/q;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    .line 203
    check-cast p1, Landroid/os/Bundle;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "KikPickUsersFragment.RESULT_SELECTED_USERS"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v3

    if-eqz v3, :cond_2

    array-length v4, v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    aget-object v0, v3, v1

    check-cast v0, Lcom/kik/cards/util/UserDataParcelable;

    iget-object v5, p0, Lkik/android/b/q;->a:Ljava/util/List;

    iget-object v6, v0, Lcom/kik/cards/util/UserDataParcelable;->a:Ljava/lang/String;

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0}, Lcom/kik/cards/util/UserDataParcelable;->a()V

    :cond_0
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/b/q;->b:Lcom/kik/g/p;

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lkik/android/b/q;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lkik/android/b/q;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 230
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lkik/android/b/q;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 236
    return-void
.end method
