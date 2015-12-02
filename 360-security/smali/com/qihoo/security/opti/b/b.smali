.class public Lcom/qihoo/security/opti/b/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Z

.field private static final b:Lcom/qihoo/security/opti/b/b;

.field private static c:J


# instance fields
.field private d:Lcom/qihoo/security/enginehelper/clean/a;

.field private e:Z

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private final i:Lcom/qihoo/security/enginehelper/clean/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/opti/b/b;->a:Z

    .line 30
    new-instance v0, Lcom/qihoo/security/opti/b/b;

    invoke-direct {v0}, Lcom/qihoo/security/opti/b/b;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/b/b;->b:Lcom/qihoo/security/opti/b/b;

    .line 32
    const-wide/32 v0, 0x3200000

    sput-wide v0, Lcom/qihoo/security/opti/b/b;->c:J

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lcom/qihoo/security/opti/b/b$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/b/b$1;-><init>(Lcom/qihoo/security/opti/b/b;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/b/b;->i:Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 109
    return-void
.end method

.method public static a()Lcom/qihoo/security/opti/b/b;
    .locals 1

    .prologue
    .line 112
    sget-object v0, Lcom/qihoo/security/opti/b/b;->b:Lcom/qihoo/security/opti/b/b;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/b/b;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/qihoo/security/opti/b/b;->h:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/b/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/qihoo/security/opti/b/b;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/b/b;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/qihoo/security/opti/b/b;->f:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/b/b;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/qihoo/security/opti/b/b;->e:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/b/b;)Lcom/qihoo/security/enginehelper/clean/a;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    return-object v0
.end method

.method static synthetic f()J
    .locals 2

    .prologue
    .line 23
    sget-wide v0, Lcom/qihoo/security/opti/b/b;->c:J

    return-wide v0
.end method

.method static synthetic g()Z
    .locals 1

    .prologue
    .line 23
    sget-boolean v0, Lcom/qihoo/security/opti/b/b;->a:Z

    return v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 116
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Landroid/content/Context;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->e()V

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    iget-object v1, p0, Lcom/qihoo/security/opti/b/b;->i:Lcom/qihoo/security/enginehelper/clean/a$b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a$b;)V

    .line 119
    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 122
    invoke-direct {p0}, Lcom/qihoo/security/opti/b/b;->h()V

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/b/b;->f:Z

    .line 124
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/b/b;->e:Z

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->NOTIFICATION:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V

    .line 126
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a([Lcom/qihoo/security/enginehelper/clean/CleanTrashType;)V

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/ArrayList;)V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->b()V

    .line 129
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 132
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/b/b;->f:Z

    .line 133
    iget-boolean v0, p0, Lcom/qihoo/security/opti/b/b;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->d:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->c()V

    .line 136
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 139
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Landroid/content/Context;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->g()Z

    move-result v0

    return v0
.end method

.method public e()V
    .locals 3

    .prologue
    .line 143
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/b/b;->h:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iget-object v2, p0, Lcom/qihoo/security/opti/b/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V

    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/b/b;->g:Ljava/lang/String;

    .line 147
    :cond_0
    return-void
.end method
