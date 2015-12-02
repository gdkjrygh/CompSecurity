.class Lcom/qihoo/security/ui/result/f$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/result/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo/security/ui/result/card/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/f;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/result/f;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/qihoo/security/ui/result/f$a;->a:Lcom/qihoo/security/ui/result/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/result/f;Lcom/qihoo/security/ui/result/f$1;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/f$a;-><init>(Lcom/qihoo/security/ui/result/f;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/result/card/a;Lcom/qihoo/security/ui/result/card/a;)I
    .locals 2

    .prologue
    .line 54
    iget-boolean v0, p1, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p2, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p1, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-nez v0, :cond_2

    iget-boolean v0, p2, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-nez v0, :cond_2

    .line 55
    :cond_1
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->d:I

    iget v1, p2, Lcom/qihoo/security/ui/result/card/a;->d:I

    sub-int/2addr v0, v1

    .line 61
    :goto_0
    return v0

    .line 56
    :cond_2
    iget-boolean v0, p1, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p2, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-nez v0, :cond_3

    .line 57
    const/4 v0, -0x1

    goto :goto_0

    .line 58
    :cond_3
    iget-boolean v0, p1, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-nez v0, :cond_4

    iget-boolean v0, p2, Lcom/qihoo/security/ui/result/card/a;->e:Z

    if-eqz v0, :cond_4

    .line 59
    const/4 v0, 0x1

    goto :goto_0

    .line 61
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 50
    check-cast p1, Lcom/qihoo/security/ui/result/card/a;

    check-cast p2, Lcom/qihoo/security/ui/result/card/a;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/result/f$a;->a(Lcom/qihoo/security/ui/result/card/a;Lcom/qihoo/security/ui/result/card/a;)I

    move-result v0

    return v0
.end method
