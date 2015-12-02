.class Lcom/facebook/common/hardware/i;
.super Landroid/telephony/PhoneStateListener;
.source "CellRadioWakeupManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/hardware/f;


# direct methods
.method private constructor <init>(Lcom/facebook/common/hardware/f;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/facebook/common/hardware/i;->a:Lcom/facebook/common/hardware/f;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/hardware/f;Lcom/facebook/common/hardware/g;)V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0, p1}, Lcom/facebook/common/hardware/i;-><init>(Lcom/facebook/common/hardware/f;)V

    return-void
.end method


# virtual methods
.method public onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/common/hardware/i;->a:Lcom/facebook/common/hardware/f;

    invoke-static {v0}, Lcom/facebook/common/hardware/f;->a(Lcom/facebook/common/hardware/f;)V

    .line 115
    return-void
.end method
