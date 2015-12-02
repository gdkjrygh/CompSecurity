.class public Lcom/qihoo/security/ui/antivirus/list/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/list/a$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Lcom/qihoo/security/ui/antivirus/list/a$a;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/ui/antivirus/list/a$a;)V
    .locals 2

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-wide/16 v0, 0x96

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/list/a;->a:J

    .line 51
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/a;->b:Lcom/qihoo/security/ui/antivirus/list/a$a;

    .line 52
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/a;)Lcom/qihoo/security/ui/antivirus/list/a$a;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a;->b:Lcom/qihoo/security/ui/antivirus/list/a$a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/a;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method private b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 80
    const/4 v2, 0x2

    new-array v2, v2, [I

    aput v1, v2, v4

    const/4 v3, 0x1

    aput v4, v2, v3

    invoke-static {v2}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v2

    const-wide/16 v4, 0x96

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    move-result-object v2

    .line 82
    new-instance v3, Lcom/qihoo/security/ui/antivirus/list/a$2;

    invoke-direct {v3, p0, p1, v1, p2}, Lcom/qihoo/security/ui/antivirus/list/a$2;-><init>(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/View;ILcom/qihoo/security/opti/trashclear/ui/i;)V

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 99
    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/a$3;

    invoke-direct {v1, p0, v0, p1}, Lcom/qihoo/security/ui/antivirus/list/a$3;-><init>(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View;)V

    invoke-virtual {v2, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 108
    invoke-virtual {v2}, Lcom/nineoldandroids/a/o;->a()V

    .line 109
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-static {p1}, Lcom/nineoldandroids/b/b;->a(Landroid/view/View;)Lcom/nineoldandroids/b/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->a(F)Lcom/nineoldandroids/b/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->c(F)Lcom/nineoldandroids/b/b;

    move-result-object v0

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/b/b;->a(J)Lcom/nineoldandroids/b/b;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/a$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/list/a$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->a(Lcom/nineoldandroids/a/a$a;)Lcom/nineoldandroids/b/b;

    .line 69
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 112
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v0

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    move-result-object v0

    .line 113
    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/a$4;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/antivirus/list/a$4;-><init>(Lcom/qihoo/security/ui/antivirus/list/a;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 121
    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 122
    return-void

    .line 112
    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data
.end method
