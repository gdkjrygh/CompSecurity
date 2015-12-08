.class public final Lcom/a/a/b/d/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/b/d/c;


# instance fields
.field private final a:Lcom/a/a/b/d/c;


# direct methods
.method public constructor <init>(Lcom/a/a/b/d/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/b/d/e;->a:Lcom/a/a/b/d/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;)Ljava/io/InputStream;
    .locals 2

    sget-object v0, Lcom/a/a/b/d/f;->a:[I

    invoke-static {p1}, Lcom/a/a/b/d/d;->a(Ljava/lang/String;)Lcom/a/a/b/d/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/a/a/b/d/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/a/a/b/d/e;->a:Lcom/a/a/b/d/c;

    invoke-interface {v0, p1, p2}, Lcom/a/a/b/d/c;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
