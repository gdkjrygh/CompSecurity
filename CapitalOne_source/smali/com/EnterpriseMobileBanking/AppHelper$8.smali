.class final Lcom/EnterpriseMobileBanking/AppHelper$8;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->genericError(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$htmlError:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 424
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$8;->val$htmlError:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 427
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$8;->val$htmlError:Ljava/lang/String;

    const-string v2, "text/html"

    const-string v3, "UTF-8"

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    return-void
.end method
