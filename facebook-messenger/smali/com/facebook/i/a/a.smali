.class public Lcom/facebook/i/a/a;
.super Ljava/lang/Object;
.source "PeerInfo.java"


# instance fields
.field a:Landroid/os/Messenger;

.field public final b:I

.field public final c:Lcom/facebook/common/process/c;


# direct methods
.method protected constructor <init>(Landroid/os/Messenger;ILcom/facebook/common/process/c;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iput-object p1, p0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    .line 34
    iput p2, p0, Lcom/facebook/i/a/a;->b:I

    .line 35
    iput-object p3, p0, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    .line 36
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lcom/facebook/i/a/a;
    .locals 4

    .prologue
    const/4 v2, -0x1

    .line 61
    const-string v0, "key_messenger"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Messenger;

    .line 62
    const-string v1, "The messenger is not in the bundle passed in"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    const-string v1, "key_pid"

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 64
    if-ne v1, v2, :cond_0

    .line 65
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The pid is not in the bundle passed in"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 67
    :cond_0
    const-string v2, "key_process_name"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 68
    const-string v3, "The process name is not in the bundle passed in"

    invoke-static {v2, v3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    new-instance v3, Lcom/facebook/i/a/a;

    invoke-static {v2}, Lcom/facebook/common/process/c;->a(Ljava/lang/String;)Lcom/facebook/common/process/c;

    move-result-object v2

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/i/a/a;-><init>(Landroid/os/Messenger;ILcom/facebook/common/process/c;)V

    return-object v3
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 83
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 84
    invoke-virtual {p0, v0}, Lcom/facebook/i/a/a;->b(Landroid/os/Bundle;)V

    .line 85
    return-object v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 77
    const-string v0, "key_messenger"

    iget-object v1, p0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 78
    const-string v0, "key_pid"

    iget v1, p0, Lcom/facebook/i/a/a;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 79
    const-string v0, "key_process_name"

    iget-object v1, p0, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v1}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 54
    instance-of v1, p1, Lcom/facebook/i/a/a;

    if-eqz v1, :cond_0

    .line 55
    iget v1, p0, Lcom/facebook/i/a/a;->b:I

    check-cast p1, Lcom/facebook/i/a/a;

    iget v2, p1, Lcom/facebook/i/a/a;->b:I

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    .line 57
    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lcom/facebook/i/a/a;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 40
    invoke-static {p0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "messenger: "

    iget-object v2, p0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "pid: "

    iget v2, p0, Lcom/facebook/i/a/a;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "process name:"

    iget-object v2, p0, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
