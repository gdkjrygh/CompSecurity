.class Lcom/EnterpriseMobileBanking/Plugins/COFBusy$7;
.super Ljava/lang/Object;
.source "COFBusy.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->show(Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    # invokes: Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->updateSpinner()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->access$500(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    .line 209
    return-void
.end method
