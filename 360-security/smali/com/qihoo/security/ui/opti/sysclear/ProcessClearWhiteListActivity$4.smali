.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;
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
        "Lcom/qihoo/security/opti/a/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

.field private final b:Ljava/text/Collator;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V
    .locals 1

    .prologue
    .line 724
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 726
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;->b:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public final a(Lcom/qihoo/security/opti/a/c$a;Lcom/qihoo/security/opti/a/c$a;)I
    .locals 3

    .prologue
    .line 731
    iget-boolean v0, p1, Lcom/qihoo/security/opti/a/c$a;->d:Z

    iget-boolean v1, p2, Lcom/qihoo/security/opti/a/c$a;->d:Z

    if-ne v0, v1, :cond_0

    .line 732
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;->b:Ljava/text/Collator;

    iget-object v1, p1, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    iget-object v2, p2, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 734
    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p1, Lcom/qihoo/security/opti/a/c$a;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 724
    check-cast p1, Lcom/qihoo/security/opti/a/c$a;

    check-cast p2, Lcom/qihoo/security/opti/a/c$a;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$4;->a(Lcom/qihoo/security/opti/a/c$a;Lcom/qihoo/security/opti/a/c$a;)I

    move-result v0

    return v0
.end method
