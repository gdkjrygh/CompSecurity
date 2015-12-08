.class public Lorg/xwalk/core/internal/XWalkClient;
.super Ljava/lang/Object;
.source "XWalkClient.java"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkClient;->mContext:Landroid/content/Context;

    .line 47
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkClient;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 48
    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Z)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "isReload"    # Z

    .prologue
    .line 107
    return-void
.end method

.method public onFormResubmission(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "dontResend"    # Landroid/os/Message;
    .param p3, "resend"    # Landroid/os/Message;

    .prologue
    .line 95
    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    .line 96
    return-void
.end method

.method public onLoadResource(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 201
    return-void
.end method

.method public onProceededAfterSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/net/http/SslError;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "error"    # Landroid/net/http/SslError;

    .prologue
    .line 116
    return-void
.end method

.method public onReceivedHttpAuthRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkHttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "handler"    # Lorg/xwalk/core/internal/XWalkHttpAuthHandler;
    .param p3, "host"    # Ljava/lang/String;
    .param p4, "realm"    # Ljava/lang/String;

    .prologue
    const/16 v8, 0xa

    const/4 v7, 0x0

    .line 152
    if-nez p1, :cond_0

    .line 183
    :goto_0
    return-void

    .line 154
    :cond_0
    move-object v1, p2

    .line 155
    .local v1, "haHandler":Lorg/xwalk/core/internal/XWalkHttpAuthHandler;
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkClient;->mContext:Landroid/content/Context;

    invoke-direct {v3, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 156
    .local v3, "layout":Landroid/widget/LinearLayout;
    new-instance v5, Landroid/widget/EditText;

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkClient;->mContext:Landroid/content/Context;

    invoke-direct {v5, v6}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 157
    .local v5, "userNameEditText":Landroid/widget/EditText;
    new-instance v4, Landroid/widget/EditText;

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkClient;->mContext:Landroid/content/Context;

    invoke-direct {v4, v6}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 158
    .local v4, "passwordEditText":Landroid/widget/EditText;
    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 159
    const/16 v6, 0x14

    invoke-virtual {v3, v8, v7, v8, v6}, Landroid/widget/LinearLayout;->setPaddingRelative(IIII)V

    .line 160
    sget v6, Lorg/xwalk/core/internal/R$string;->http_auth_user_name:I

    invoke-virtual {v5, v6}, Landroid/widget/EditText;->setHint(I)V

    .line 161
    sget v6, Lorg/xwalk/core/internal/R$string;->http_auth_password:I

    invoke-virtual {v4, v6}, Landroid/widget/EditText;->setHint(I)V

    .line 162
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 163
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 165
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkClient;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v6}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 166
    .local v0, "curActivity":Landroid/app/Activity;
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 167
    .local v2, "httpAuthDialog":Landroid/app/AlertDialog$Builder;
    sget v6, Lorg/xwalk/core/internal/R$string;->http_auth_title:I

    invoke-virtual {v2, v6}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    sget v7, Lorg/xwalk/core/internal/R$string;->http_auth_log_in:I

    new-instance v8, Lorg/xwalk/core/internal/XWalkClient$2;

    invoke-direct {v8, p0, v5, v4, v1}, Lorg/xwalk/core/internal/XWalkClient$2;-><init>(Lorg/xwalk/core/internal/XWalkClient;Landroid/widget/EditText;Landroid/widget/EditText;Lorg/xwalk/core/internal/XWalkHttpAuthHandler;)V

    invoke-virtual {v6, v7, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    const/high16 v7, 0x1040000

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    new-instance v7, Lorg/xwalk/core/internal/XWalkClient$1;

    invoke-direct {v7, p0, v1}, Lorg/xwalk/core/internal/XWalkClient$1;-><init>(Lorg/xwalk/core/internal/XWalkClient;Lorg/xwalk/core/internal/XWalkHttpAuthHandler;)V

    invoke-virtual {v6, v7}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/AlertDialog;->show()V

    goto :goto_0
.end method

.method public onReceivedLoginRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "realm"    # Ljava/lang/String;
    .param p3, "account"    # Ljava/lang/String;
    .param p4, "args"    # Ljava/lang/String;

    .prologue
    .line 197
    return-void
.end method

.method public onRendererResponsive(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 64
    return-void
.end method

.method public onRendererUnresponsive(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 56
    return-void
.end method

.method public onTooManyRedirects(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "cancelMsg"    # Landroid/os/Message;
    .param p3, "continueMsg"    # Landroid/os/Message;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 81
    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    .line 82
    return-void
.end method
