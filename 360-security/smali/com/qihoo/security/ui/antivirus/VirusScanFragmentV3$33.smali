.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$33;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Ljava/io/File;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 3163
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$33;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$33;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 3166
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$33;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3167
    const/4 v0, 0x1

    .line 3169
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
