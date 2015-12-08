.class Lcom/splunk/mint/EventDataPingSettings;
.super Lcom/splunk/mint/ActionEvent;
.source "EventDataPingSettings.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .param p1, "type"    # Lcom/splunk/mint/EnumActionType;
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "level"    # Ljava/lang/Integer;

    .prologue
    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/splunk/mint/ActionEvent;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 18
    return-void
.end method


# virtual methods
.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 0
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 59
    return-void
.end method
