.class public final Lclient/core/model/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/util/ArrayList;

.field b:Z

.field private c:J

.field private d:J

.field private e:J

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide v0, p0, Lclient/core/model/a;->c:J

    .line 16
    iput-wide v0, p0, Lclient/core/model/a;->d:J

    .line 17
    iput-wide v0, p0, Lclient/core/model/a;->e:J

    .line 18
    const-string v0, "TRACER"

    iput-object v0, p0, Lclient/core/model/a;->f:Ljava/lang/String;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lclient/core/model/a;->a:Ljava/util/ArrayList;

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lclient/core/model/a;->b:Z

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lclient/core/model/a;->c:J

    .line 53
    invoke-virtual {p0}, Lclient/core/model/a;->a()Lclient/core/model/a;

    .line 54
    const-string v0, "."

    invoke-virtual {p0, v0}, Lclient/core/model/a;->a(Ljava/lang/String;)Lclient/core/model/a;

    .line 55
    return-void
.end method


# virtual methods
.method public final a()Lclient/core/model/a;
    .locals 2

    .prologue
    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lclient/core/model/a;->a:Ljava/util/ArrayList;

    .line 95
    sget v0, Lclient/core/model/b;->a:I

    .line 1058
    sget-object v1, Lclient/core/model/c;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 96
    :goto_0
    return-object p0

    .line 1060
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lclient/core/model/a;->d:J

    goto :goto_0

    .line 1063
    :pswitch_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lclient/core/model/a;->e:J

    goto :goto_0

    .line 1058
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;)Lclient/core/model/a;
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lclient/core/model/a;->a:Ljava/util/ArrayList;

    new-instance v1, Lclient/core/model/d;

    invoke-direct {v1, p0, p1}, Lclient/core/model/d;-><init>(Lclient/core/model/a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    return-object p0
.end method
