.class public Lcom/qihoo/security/installreport/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field static final a:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    const-string/jumbo v0, "content://com.qihoo.security.lite.installreport"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/installreport/b;->a:Landroid/net/Uri;

    return-void
.end method
