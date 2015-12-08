.class Lcom/EnterpriseMobileBanking/Plugins/COFBusy$1;
.super Ljava/lang/Object;
.source "COFBusy.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/Plugins/COFBusy;
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
    .line 51
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->forceHide()V

    .line 56
    return-void
.end method
