.class Lcom/facebook/mqtt/f;
.super Ljava/lang/Object;
.source "MqttClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:Lcom/facebook/mqtt/x;

.field final synthetic d:Z

.field final synthetic e:I

.field final synthetic f:Lcom/facebook/mqtt/b;


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/b;Ljava/lang/String;[BLcom/facebook/mqtt/x;ZI)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/facebook/mqtt/f;->f:Lcom/facebook/mqtt/b;

    iput-object p2, p0, Lcom/facebook/mqtt/f;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/mqtt/f;->b:[B

    iput-object p4, p0, Lcom/facebook/mqtt/f;->c:Lcom/facebook/mqtt/x;

    iput-boolean p5, p0, Lcom/facebook/mqtt/f;->d:Z

    iput p6, p0, Lcom/facebook/mqtt/f;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 292
    iget-object v0, p0, Lcom/facebook/mqtt/f;->f:Lcom/facebook/mqtt/b;

    iget-object v1, p0, Lcom/facebook/mqtt/f;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/mqtt/f;->b:[B

    iget-object v3, p0, Lcom/facebook/mqtt/f;->c:Lcom/facebook/mqtt/x;

    invoke-virtual {v3}, Lcom/facebook/mqtt/x;->getValue()I

    move-result v3

    iget-boolean v4, p0, Lcom/facebook/mqtt/f;->d:Z

    iget v5, p0, Lcom/facebook/mqtt/f;->e:I

    invoke-static/range {v0 .. v5}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/b;Ljava/lang/String;[BIZI)V

    .line 293
    return-void
.end method
