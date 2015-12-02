.class public Lcom/qihoo/security/ui/fragment/a;
.super Landroid/support/v4/app/g;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/fragment/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/fragment/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/f;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1}, Landroid/support/v4/app/g;-><init>(Landroid/support/v4/app/f;)V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/fragment/a;->a:Ljava/util/ArrayList;

    .line 47
    return-void
.end method


# virtual methods
.method public a(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/qihoo/security/ui/fragment/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/fragment/a$a;

    .line 70
    if-nez v0, :cond_0

    .line 71
    const/4 v0, 0x0

    .line 73
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a$a;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 51
    new-instance v1, Lcom/qihoo/security/ui/fragment/a$a;

    invoke-direct {v1, p1, v0, p3, p4}, Lcom/qihoo/security/ui/fragment/a$a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/ui/fragment/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-virtual {p0}, Lcom/qihoo/security/ui/fragment/a;->c()V

    .line 54
    return-void
.end method

.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 78
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/g;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 79
    return-void
.end method

.method public b()I
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/qihoo/security/ui/fragment/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public c(I)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/qihoo/security/ui/fragment/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/fragment/a$a;

    .line 64
    invoke-static {v0}, Lcom/qihoo/security/ui/fragment/a$a;->a(Lcom/qihoo/security/ui/fragment/a$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
