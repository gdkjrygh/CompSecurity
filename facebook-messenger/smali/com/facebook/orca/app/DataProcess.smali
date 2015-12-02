.class public Lcom/facebook/orca/app/DataProcess;
.super Ljava/lang/Object;
.source "DataProcess.java"


# static fields
.field public static final a:Lcom/facebook/common/process/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 17
    const-string v0, "com.facebook.orca"

    const-string v1, "data"

    invoke-static {v0, v1}, Lcom/facebook/common/process/c;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/process/c;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/app/DataProcess;->a:Lcom/facebook/common/process/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    return-void
.end method
