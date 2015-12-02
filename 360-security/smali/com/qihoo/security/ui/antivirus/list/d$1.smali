.class Lcom/qihoo/security/ui/antivirus/list/d$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/list/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/list/d;

.field private final b:Ljava/text/Collator;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/d;)V
    .locals 1

    .prologue
    .line 283
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/d$1;->a:Lcom/qihoo/security/ui/antivirus/list/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 284
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d$1;->b:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/malware/vo/MaliciousInfo;Lcom/qihoo/security/malware/vo/MaliciousInfo;)I
    .locals 3

    .prologue
    .line 288
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d$1;->b:Ljava/text/Collator;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/d$1;->a:Lcom/qihoo/security/ui/antivirus/list/d;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/d;->a(Lcom/qihoo/security/ui/antivirus/list/d;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/d$1;->a:Lcom/qihoo/security/ui/antivirus/list/d;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/list/d;->a(Lcom/qihoo/security/ui/antivirus/list/d;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 283
    check-cast p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    check-cast p2, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/d$1;->a(Lcom/qihoo/security/malware/vo/MaliciousInfo;Lcom/qihoo/security/malware/vo/MaliciousInfo;)I

    move-result v0

    return v0
.end method
