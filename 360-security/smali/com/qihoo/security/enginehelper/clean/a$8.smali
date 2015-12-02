.class Lcom/qihoo/security/enginehelper/clean/a$8;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

.field final synthetic b:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iput-object p2, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->a:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 173
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->b:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->a:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/CleanScanType;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$8;->a:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/CleanScanType;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    .line 177
    return-void
.end method
