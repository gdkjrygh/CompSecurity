.class final Lcom/cleanmaster/sdk/cmloginsdkjar/b;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/ab;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/ac;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/os/Handler;

.field private c:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

.field private d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

.field private e:I


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a:Ljava/util/Map;

    .line 18
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->b:Landroid/os/Handler;

    .line 19
    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->e:I

    return v0
.end method

.method final a(J)V
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->b:Landroid/os/Handler;

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->c:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;-><init>(Landroid/os/Handler;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    .line 37
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->c:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    invoke-virtual {v0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;->b(J)V

    .line 41
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->e:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    long-to-int v0, v0

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->e:I

    .line 42
    return-void
.end method

.method public final a(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 1

    .prologue
    .line 22
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->c:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 23
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    :goto_0
    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/ac;

    .line 24
    return-void

    .line 23
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/ac;",
            ">;"
        }
    .end annotation

    .prologue
    .line 31
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a:Ljava/util/Map;

    return-object v0
.end method

.method public final write(I)V
    .locals 2

    .prologue
    .line 56
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a(J)V

    .line 57
    return-void
.end method

.method public final write([B)V
    .locals 2

    .prologue
    .line 46
    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a(J)V

    .line 47
    return-void
.end method

.method public final write([BII)V
    .locals 2

    .prologue
    .line 51
    int-to-long v0, p3

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a(J)V

    .line 52
    return-void
.end method
