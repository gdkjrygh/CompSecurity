.class Lcom/qihoo/security/booster/b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/booster/b;->b(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/qihoo/security/booster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/booster/b;II)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/qihoo/security/booster/b$2;->c:Lcom/qihoo/security/booster/b;

    iput p2, p0, Lcom/qihoo/security/booster/b$2;->a:I

    iput p3, p0, Lcom/qihoo/security/booster/b$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lcom/qihoo/security/booster/b$2;->c:Lcom/qihoo/security/booster/b;

    iget v1, p0, Lcom/qihoo/security/booster/b$2;->a:I

    iget v2, p0, Lcom/qihoo/security/booster/b$2;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/booster/b;->a_(II)V

    .line 86
    return-void
.end method
