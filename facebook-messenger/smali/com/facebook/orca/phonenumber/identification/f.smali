.class public Lcom/facebook/orca/phonenumber/identification/f;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberSmsConsumer.java"


# instance fields
.field private a:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/os/Handler;

.field private c:Ljava/lang/Runnable;

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->d:Z

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/phonenumber/identification/f;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/phonenumber/identification/f;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/orca/phonenumber/identification/f;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 117
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->e()V

    .line 118
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->f()V

    .line 120
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/orca/phonenumber/identification/f;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\\s\\w+"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 152
    const-string v2, "\\w+$"

    .line 154
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 155
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 156
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 176
    :goto_0
    return-object v0

    .line 160
    :cond_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    .line 161
    const-string v2, "\\w+$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 162
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_2

    move-object v0, v1

    .line 164
    goto :goto_0

    .line 168
    :cond_1
    const-string v0, "\\d{4,}"

    .line 169
    const-string v0, "\\d{4,}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 170
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_2

    move-object v0, v1

    .line 172
    goto :goto_0

    .line 176
    :cond_2
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Cannot get the confirmation sms from Facebook"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 110
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->f()V

    .line 112
    :cond_0
    return-void
.end method

.method private d()V
    .locals 4

    .prologue
    .line 123
    new-instance v0, Lcom/facebook/orca/phonenumber/identification/g;

    invoke-direct {v0, p0}, Lcom/facebook/orca/phonenumber/identification/g;-><init>(Lcom/facebook/orca/phonenumber/identification/f;)V

    iput-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->c:Ljava/lang/Runnable;

    .line 130
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/phonenumber/identification/f;->c:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 131
    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->c:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/phonenumber/identification/f;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 136
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->c:Ljava/lang/Runnable;

    .line 138
    :cond_0
    return-void
.end method

.method private f()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 192
    iput-object v1, p0, Lcom/facebook/orca/phonenumber/identification/f;->f:Ljava/lang/String;

    .line 193
    iput-object v1, p0, Lcom/facebook/orca/phonenumber/identification/f;->b:Landroid/os/Handler;

    .line 194
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->d:Z

    .line 195
    iput-object v1, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    .line 196
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;Ljava/lang/String;)Lcom/google/common/d/a/s;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 65
    const-wide/16 v3, 0x7530

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/phonenumber/identification/f;->a(Landroid/os/Handler;Ljava/lang/String;JZ)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Handler;Ljava/lang/String;JZ)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/lang/String;",
            "JZ)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 73
    if-eqz p1, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "Null Handler!"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 74
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x5

    if-gt v0, v3, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    const-string v0, "Invalid marker length!"

    invoke-static {v2, v0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 78
    iput-object p2, p0, Lcom/facebook/orca/phonenumber/identification/f;->f:Ljava/lang/String;

    .line 79
    iput-object p1, p0, Lcom/facebook/orca/phonenumber/identification/f;->b:Landroid/os/Handler;

    .line 80
    iput-wide p3, p0, Lcom/facebook/orca/phonenumber/identification/f;->g:J

    .line 81
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    .line 82
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->d()V

    .line 83
    iput-boolean v1, p0, Lcom/facebook/orca/phonenumber/identification/f;->d:Z

    .line 84
    iput-boolean p5, p0, Lcom/facebook/orca/phonenumber/identification/f;->e:Z

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->a:Lcom/google/common/d/a/ab;

    return-object v0

    :cond_2
    move v0, v2

    .line 73
    goto :goto_0
.end method

.method public a()V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->e()V

    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/f;->f()V

    .line 91
    return-void
.end method

.method public a(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 95
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 96
    invoke-direct {p0, v0}, Lcom/facebook/orca/phonenumber/identification/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_0

    .line 98
    new-instance v1, Lcom/facebook/orca/phonenumber/identification/h;

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/phonenumber/identification/h;-><init>(Lcom/facebook/orca/phonenumber/identification/f;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 100
    iget-boolean v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->e:Z

    .line 104
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 184
    iget-boolean v0, p0, Lcom/facebook/orca/phonenumber/identification/f;->d:Z

    return v0
.end method
