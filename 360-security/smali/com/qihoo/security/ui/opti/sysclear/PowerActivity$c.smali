.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field b:Ljava/lang/CharSequence;

.field c:Z

.field d:I

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field public i:[I

.field public j:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;IZZZ[II)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2037
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2024
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->b:Ljava/lang/CharSequence;

    .line 2025
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 2026
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    .line 2028
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->e:Z

    .line 2029
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->f:Z

    .line 2030
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->g:Z

    .line 2031
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    .line 2034
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    .line 2038
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    .line 2039
    iput p3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    .line 2040
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 2041
    iput-boolean p4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->e:Z

    .line 2042
    iput-boolean p5, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->g:Z

    .line 2043
    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->b:Ljava/lang/CharSequence;

    .line 2044
    iput-boolean p6, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    .line 2045
    iput-object p7, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->i:[I

    .line 2046
    iput p8, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    .line 2048
    if-eqz p6, :cond_0

    .line 2049
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 2051
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 2062
    if-nez p1, :cond_1

    .line 2070
    :cond_0
    :goto_0
    return v0

    .line 2065
    :cond_1
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    iget v2, p1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    if-ge v1, v2, :cond_2

    .line 2066
    const/4 v0, 0x1

    goto :goto_0

    .line 2067
    :cond_2
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    iget v2, p1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    if-gt v1, v2, :cond_0

    .line 2070
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(I)V
    .locals 0

    .prologue
    .line 2054
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    .line 2055
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 2021
    check-cast p1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)I

    move-result v0

    return v0
.end method
