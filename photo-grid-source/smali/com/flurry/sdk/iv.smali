.class public Lcom/flurry/sdk/iv;
.super Lcom/flurry/sdk/kp;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/lh$a;


# static fields
.field private static final e:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;


# instance fields
.field private h:Ljava/lang/String;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/flurry/sdk/iv;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    .line 31
    const-string v0, "http://data.flurry.com/aap.do"

    sput-object v0, Lcom/flurry/sdk/iv;->f:Ljava/lang/String;

    .line 32
    const-string v0, "https://data.flurry.com/aap.do"

    sput-object v0, Lcom/flurry/sdk/iv;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/flurry/sdk/iv;-><init>(Lcom/flurry/sdk/kp$a;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Lcom/flurry/sdk/kp$a;)V
    .locals 2

    .prologue
    .line 45
    const-string v0, "Analytics"

    const-class v1, Lcom/flurry/sdk/iv;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/flurry/sdk/kp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "AnalyticsData_"

    iput-object v0, p0, Lcom/flurry/sdk/iv;->d:Ljava/lang/String;

    .line 47
    invoke-direct {p0}, Lcom/flurry/sdk/iv;->h()V

    .line 48
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/iv;->a(Lcom/flurry/sdk/kp$a;)V

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/iv;)V
    .locals 0

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/flurry/sdk/iv;->e()V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/iv;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/iv;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 93
    if-eqz p1, :cond_0

    const-string v0, ".do"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    const/4 v0, 0x5

    sget-object v1, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    const-string v2, "overriding analytics agent report URL without an endpoint, are you sure?"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 97
    :cond_0
    iput-object p1, p0, Lcom/flurry/sdk/iv;->h:Ljava/lang/String;

    .line 98
    return-void
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    return-object v0
.end method

.method private h()V
    .locals 5

    .prologue
    const/4 v4, 0x4

    .line 52
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v1

    .line 54
    const-string v0, "UseHttps"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/iv;->i:Z

    .line 55
    const-string v0, "UseHttps"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 56
    sget-object v0, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, UseHttps = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/iv;->i:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "ReportUrl"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 59
    const-string v2, "ReportUrl"

    invoke-virtual {v1, v2, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 60
    invoke-direct {p0, v0}, Lcom/flurry/sdk/iv;->b(Ljava/lang/String;)V

    .line 61
    sget-object v1, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, ReportUrl = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v1, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 62
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 65
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "UseHttps"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 66
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "ReportUrl"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 67
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 71
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 82
    const/4 v0, 0x6

    sget-object v1, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    const-string v2, "onSettingUpdate internal error!"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 85
    :goto_1
    return-void

    .line 71
    :sswitch_0
    const-string v1, "UseHttps"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_1
    const-string v1, "ReportUrl"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 73
    :pswitch_0
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/iv;->i:Z

    .line 74
    sget-object v0, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onSettingUpdate, UseHttps = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/flurry/sdk/iv;->i:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 77
    :pswitch_1
    check-cast p2, Ljava/lang/String;

    .line 78
    invoke-direct {p0, p2}, Lcom/flurry/sdk/iv;->b(Ljava/lang/String;)V

    .line 79
    sget-object v0, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onSettingUpdate, ReportUrl = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 71
    :sswitch_data_0
    .sparse-switch
        -0xe48ec3c -> :sswitch_0
        0x62629b7b -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 164
    new-instance v0, Lcom/flurry/sdk/iv$2;

    invoke-direct {v0, p0, p3}, Lcom/flurry/sdk/iv$2;-><init>(Lcom/flurry/sdk/iv;I)V

    invoke-virtual {p0, v0}, Lcom/flurry/sdk/iv;->a(Lcom/flurry/sdk/lr;)V

    .line 174
    invoke-super {p0, p1, p2, p3}, Lcom/flurry/sdk/kp;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 175
    return-void
.end method

.method protected a([BLjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 117
    invoke-virtual {p0}, Lcom/flurry/sdk/iv;->b()Ljava/lang/String;

    move-result-object v0

    .line 119
    const/4 v1, 0x4

    sget-object v2, Lcom/flurry/sdk/iv;->e:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FlurryDataSender: start upload data "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " with id = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 122
    new-instance v1, Lcom/flurry/sdk/kj;

    invoke-direct {v1}, Lcom/flurry/sdk/kj;-><init>()V

    .line 123
    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;)V

    .line 124
    const v0, 0x186a0

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->d(I)V

    .line 125
    sget-object v0, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kl$a;)V

    .line 126
    const-string v0, "Content-Type"

    const-string v2, "application/octet-stream"

    invoke-virtual {v1, v0, v2}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    new-instance v0, Lcom/flurry/sdk/kt;

    invoke-direct {v0}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kx;)V

    .line 128
    invoke-virtual {v1, p1}, Lcom/flurry/sdk/kj;->a(Ljava/lang/Object;)V

    .line 129
    new-instance v0, Lcom/flurry/sdk/iv$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/flurry/sdk/iv$1;-><init>(Lcom/flurry/sdk/iv;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj$a;)V

    .line 159
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    move-result-object v0

    invoke-virtual {v0, p0, v1}, Lcom/flurry/sdk/jm;->a(Ljava/lang/Object;Lcom/flurry/sdk/ls;)V

    .line 160
    return-void
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/flurry/sdk/iv;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/flurry/sdk/iv;->h:Ljava/lang/String;

    .line 112
    :goto_0
    return-object v0

    .line 109
    :cond_0
    iget-boolean v0, p0, Lcom/flurry/sdk/iv;->i:Z

    if-eqz v0, :cond_1

    .line 110
    sget-object v0, Lcom/flurry/sdk/iv;->g:Ljava/lang/String;

    goto :goto_0

    .line 112
    :cond_1
    sget-object v0, Lcom/flurry/sdk/iv;->f:Ljava/lang/String;

    goto :goto_0
.end method
