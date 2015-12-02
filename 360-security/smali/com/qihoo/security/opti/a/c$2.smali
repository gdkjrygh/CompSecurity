.class Lcom/qihoo/security/opti/a/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/a/c;
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
.field final synthetic a:Lcom/qihoo/security/opti/a/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/a/c;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c$2;->a:Lcom/qihoo/security/opti/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/qihoo/security/opti/a/c$a;Lcom/qihoo/security/opti/a/c$a;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 174
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v1, p1, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p2, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 175
    iget-object v1, p1, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    .line 176
    iget-object v2, p2, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_1

    .line 178
    const/4 v0, 0x1

    .line 185
    :cond_0
    :goto_0
    return v0

    .line 179
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_0

    .line 180
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 171
    check-cast p1, Lcom/qihoo/security/opti/a/c$a;

    check-cast p2, Lcom/qihoo/security/opti/a/c$a;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/opti/a/c$2;->a(Lcom/qihoo/security/opti/a/c$a;Lcom/qihoo/security/opti/a/c$a;)I

    move-result v0

    return v0
.end method
