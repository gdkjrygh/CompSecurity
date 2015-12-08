.class public Lorg/xwalk/core/internal/XWalkResourceClientInternal;
.super Ljava/lang/Object;
.source "XWalkResourceClientInternal.java"


# annotations
.annotation build Lorg/xwalk/core/internal/XWalkAPI;
    createExternally = true
.end annotation


# static fields
.field public static final ERROR_AUTHENTICATION:I = -0x4
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_BAD_URL:I = -0xc
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_CONNECT:I = -0x6
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_FAILED_SSL_HANDSHAKE:I = -0xb
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_FILE:I = -0xd
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_FILE_NOT_FOUND:I = -0xe
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_HOST_LOOKUP:I = -0x2
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_IO:I = -0x7
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_OK:I = 0x0
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_PROXY_AUTHENTICATION:I = -0x5
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_REDIRECT_LOOP:I = -0x9
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_TIMEOUT:I = -0x8
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_TOO_MANY_REQUESTS:I = -0xf
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_UNKNOWN:I = -0x1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_UNSUPPORTED_AUTH_SCHEME:I = -0x3
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field

.field public static final ERROR_UNSUPPORTED_SCHEME:I = -0xa
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    return-void
.end method


# virtual methods
.method public onLoadFinished(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 147
    return-void
.end method

.method public onLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 136
    return-void
.end method

.method public onProgressChanged(Lorg/xwalk/core/internal/XWalkViewInternal;I)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "progressInPercent"    # I
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 157
    return-void
.end method

.method public onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewInternal;ILjava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 190
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 191
    .local v1, "dialogBuilder":Landroid/app/AlertDialog$Builder;
    const v2, 0x1040014

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const v3, 0x104000a

    new-instance v4, Lorg/xwalk/core/internal/XWalkResourceClientInternal$1;

    invoke-direct {v4, p0}, Lorg/xwalk/core/internal/XWalkResourceClientInternal$1;-><init>(Lorg/xwalk/core/internal/XWalkResourceClientInternal;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 200
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 201
    .local v0, "dialog":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 202
    return-void
.end method

.method public onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p3, "error"    # Landroid/net/http/SslError;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/net/http/SslError;",
            ")V"
        }
    .end annotation

    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 238
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    move-object v1, p2

    .line 239
    .local v1, "valueCallback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 240
    .local v0, "dialogBuilder":Landroid/app/AlertDialog$Builder;
    sget v2, Lorg/xwalk/core/internal/R$string;->ssl_alert_title:I

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const v3, 0x104000a

    new-instance v4, Lorg/xwalk/core/internal/XWalkResourceClientInternal$4;

    invoke-direct {v4, p0, v1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal$4;-><init>(Lorg/xwalk/core/internal/XWalkResourceClientInternal;Landroid/webkit/ValueCallback;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/high16 v3, 0x1040000

    new-instance v4, Lorg/xwalk/core/internal/XWalkResourceClientInternal$3;

    invoke-direct {v4, p0, v1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal$3;-><init>(Lorg/xwalk/core/internal/XWalkResourceClientInternal;Landroid/webkit/ValueCallback;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    new-instance v3, Lorg/xwalk/core/internal/XWalkResourceClientInternal$2;

    invoke-direct {v3, p0, v1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal$2;-><init>(Lorg/xwalk/core/internal/XWalkResourceClientInternal;Landroid/webkit/ValueCallback;)V

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 259
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 260
    return-void
.end method

.method public shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 176
    const/4 v0, 0x0

    return-object v0
.end method

.method public shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 221
    const/4 v0, 0x0

    return v0
.end method
