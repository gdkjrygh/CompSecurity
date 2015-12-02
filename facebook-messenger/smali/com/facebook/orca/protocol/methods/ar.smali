.class public Lcom/facebook/orca/protocol/methods/ar;
.super Ljava/lang/Object;
.source "SendViaChatResult.java"


# instance fields
.field private a:Lcom/facebook/orca/protocol/methods/au;

.field private b:Lcom/facebook/orca/protocol/methods/at;

.field private c:I

.field private d:Ljava/lang/Exception;

.field private e:Lcom/facebook/orca/server/NewMessageResult;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/methods/au;Lcom/facebook/orca/protocol/methods/at;ILjava/lang/Exception;Lcom/facebook/orca/server/NewMessageResult;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    sget-object v0, Lcom/facebook/orca/protocol/methods/as;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/protocol/methods/au;->ordinal()I

    move-result v3

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    .line 75
    :goto_0
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/ar;->a:Lcom/facebook/orca/protocol/methods/au;

    .line 76
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/ar;->b:Lcom/facebook/orca/protocol/methods/at;

    .line 77
    iput p3, p0, Lcom/facebook/orca/protocol/methods/ar;->c:I

    .line 78
    iput-object p4, p0, Lcom/facebook/orca/protocol/methods/ar;->d:Ljava/lang/Exception;

    .line 79
    iput-object p5, p0, Lcom/facebook/orca/protocol/methods/ar;->e:Lcom/facebook/orca/server/NewMessageResult;

    .line 80
    return-void

    .line 61
    :pswitch_0
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->NONE:Lcom/facebook/orca/protocol/methods/at;

    if-ne p2, v0, :cond_0

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 62
    if-nez p4, :cond_1

    move v0, v1

    :goto_2
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 63
    if-eqz p5, :cond_2

    :goto_3
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    goto :goto_0

    :cond_0
    move v0, v2

    .line 61
    goto :goto_1

    :cond_1
    move v0, v2

    .line 62
    goto :goto_2

    :cond_2
    move v1, v2

    .line 63
    goto :goto_3

    .line 66
    :pswitch_1
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->NONE:Lcom/facebook/orca/protocol/methods/at;

    if-eq p2, v0, :cond_3

    move v0, v1

    :goto_4
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 67
    if-nez p5, :cond_4

    :goto_5
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    goto :goto_0

    :cond_3
    move v0, v2

    .line 66
    goto :goto_4

    :cond_4
    move v1, v2

    .line 67
    goto :goto_5

    .line 70
    :pswitch_2
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->NONE:Lcom/facebook/orca/protocol/methods/at;

    if-eq p2, v0, :cond_5

    move v0, v1

    :goto_6
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 71
    if-nez p5, :cond_6

    :goto_7
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    goto :goto_0

    :cond_5
    move v0, v2

    .line 70
    goto :goto_6

    :cond_6
    move v1, v2

    .line 71
    goto :goto_7

    .line 59
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Lcom/facebook/orca/protocol/methods/at;)Lcom/facebook/orca/protocol/methods/ar;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 87
    new-instance v0, Lcom/facebook/orca/protocol/methods/ar;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->SKIPPED:Lcom/facebook/orca/protocol/methods/au;

    const/4 v3, 0x0

    move-object v2, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/ar;-><init>(Lcom/facebook/orca/protocol/methods/au;Lcom/facebook/orca/protocol/methods/at;ILjava/lang/Exception;Lcom/facebook/orca/server/NewMessageResult;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/orca/protocol/methods/at;I)Lcom/facebook/orca/protocol/methods/ar;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 101
    new-instance v0, Lcom/facebook/orca/protocol/methods/ar;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    move-object v2, p0

    move v3, p1

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/ar;-><init>(Lcom/facebook/orca/protocol/methods/au;Lcom/facebook/orca/protocol/methods/at;ILjava/lang/Exception;Lcom/facebook/orca/server/NewMessageResult;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/orca/server/NewMessageResult;)Lcom/facebook/orca/protocol/methods/ar;
    .locals 6

    .prologue
    .line 128
    new-instance v0, Lcom/facebook/orca/protocol/methods/ar;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->SUCCEEDED:Lcom/facebook/orca/protocol/methods/au;

    sget-object v2, Lcom/facebook/orca/protocol/methods/at;->NONE:Lcom/facebook/orca/protocol/methods/at;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/ar;-><init>(Lcom/facebook/orca/protocol/methods/au;Lcom/facebook/orca/protocol/methods/at;ILjava/lang/Exception;Lcom/facebook/orca/server/NewMessageResult;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Exception;I)Lcom/facebook/orca/protocol/methods/ar;
    .locals 6

    .prologue
    .line 115
    new-instance v0, Lcom/facebook/orca/protocol/methods/ar;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    sget-object v2, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_UNKNOWN_EXCEPTION:Lcom/facebook/orca/protocol/methods/at;

    const/4 v5, 0x0

    move v3, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/ar;-><init>(Lcom/facebook/orca/protocol/methods/au;Lcom/facebook/orca/protocol/methods/at;ILjava/lang/Exception;Lcom/facebook/orca/server/NewMessageResult;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/au;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->a:Lcom/facebook/orca/protocol/methods/au;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/server/NewMessageResult;
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->a:Lcom/facebook/orca/protocol/methods/au;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->SUCCEEDED:Lcom/facebook/orca/protocol/methods/au;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->e:Lcom/facebook/orca/server/NewMessageResult;

    return-object v0

    .line 148
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->a:Lcom/facebook/orca/protocol/methods/au;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->SKIPPED:Lcom/facebook/orca/protocol/methods/au;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->b:Lcom/facebook/orca/protocol/methods/at;

    iget-object v0, v0, Lcom/facebook/orca/protocol/methods/at;->message:Ljava/lang/String;

    return-object v0

    .line 157
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->a:Lcom/facebook/orca/protocol/methods/au;

    sget-object v3, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 169
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->b:Lcom/facebook/orca/protocol/methods/at;

    sget-object v3, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_UNKNOWN_EXCEPTION:Lcom/facebook/orca/protocol/methods/at;

    if-ne v0, v3, :cond_1

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->b:Lcom/facebook/orca/protocol/methods/at;

    iget-object v0, v0, Lcom/facebook/orca/protocol/methods/at;->message:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/ar;->d:Ljava/lang/Exception;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 173
    :goto_1
    return-object v0

    :cond_0
    move v0, v2

    .line 166
    goto :goto_0

    .line 173
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->b:Lcom/facebook/orca/protocol/methods/at;

    iget-object v0, v0, Lcom/facebook/orca/protocol/methods/at;->message:Ljava/lang/String;

    goto :goto_1
.end method

.method public e()I
    .locals 2

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ar;->a:Lcom/facebook/orca/protocol/methods/au;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 182
    iget v0, p0, Lcom/facebook/orca/protocol/methods/ar;->c:I

    return v0

    .line 181
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
