.class public Lcom/facebook/common/hardware/e;
.super Ljava/lang/Object;
.source "CellDiagnosticsSerializer.java"


# instance fields
.field private final a:Landroid/telephony/TelephonyManager;

.field private final b:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Landroid/telephony/TelephonyManager;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/common/hardware/e;->a:Landroid/telephony/TelephonyManager;

    .line 35
    iput-object p2, p0, Lcom/facebook/common/hardware/e;->b:Lcom/facebook/common/time/a;

    .line 36
    return-void
.end method
