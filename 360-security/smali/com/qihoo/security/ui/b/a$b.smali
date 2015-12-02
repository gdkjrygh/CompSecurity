.class final Lcom/qihoo/security/ui/b/a$b;
.super Landroid/support/v4/c/f;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/c/f",
        "<",
        "Ljava/lang/Integer;",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/b/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/a;)V
    .locals 1

    .prologue
    .line 95
    iput-object p1, p0, Lcom/qihoo/security/ui/b/a$b;->a:Lcom/qihoo/security/ui/b/a;

    .line 96
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Landroid/support/v4/c/f;-><init>(I)V

    .line 97
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$b;->a:Lcom/qihoo/security/ui/b/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/a;->a(Lcom/qihoo/security/ui/b/a;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 94
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/b/a$b;->a(Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
