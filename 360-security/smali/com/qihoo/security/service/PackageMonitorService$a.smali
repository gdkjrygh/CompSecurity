.class Lcom/qihoo/security/service/PackageMonitorService$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/service/PackageMonitorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:[I

.field b:[Ljava/lang/CharSequence;

.field final synthetic c:Lcom/qihoo/security/service/PackageMonitorService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/PackageMonitorService;)V
    .locals 1

    .prologue
    .line 406
    iput-object p1, p0, Lcom/qihoo/security/service/PackageMonitorService$a;->c:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 413
    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    .line 418
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService$a;->b:[Ljava/lang/CharSequence;

    return-void
.end method
