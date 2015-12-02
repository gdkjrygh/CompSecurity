.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
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

    .line 2224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2210
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    .line 2211
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 2212
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    .line 2214
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->e:Z

    .line 2215
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->f:Z

    .line 2216
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->g:Z

    .line 2217
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    .line 2220
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->j:I

    .line 2225
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    .line 2226
    iput p3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    .line 2227
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 2228
    iput-boolean p4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->e:Z

    .line 2229
    iput-boolean p5, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->g:Z

    .line 2230
    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    .line 2231
    iput-boolean p6, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    .line 2232
    iput-object p7, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->i:[I

    .line 2233
    iput p8, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->j:I

    .line 2234
    if-eqz p6, :cond_0

    .line 2235
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 2237
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 2248
    if-nez p1, :cond_1

    .line 2256
    :cond_0
    :goto_0
    return v0

    .line 2251
    :cond_1
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    iget v2, p1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    if-ge v1, v2, :cond_2

    .line 2252
    const/4 v0, 0x1

    goto :goto_0

    .line 2253
    :cond_2
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    iget v2, p1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    if-gt v1, v2, :cond_0

    .line 2256
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(I)V
    .locals 0

    .prologue
    .line 2240
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    .line 2241
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 2207
    check-cast p1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)I

    move-result v0

    return v0
.end method
