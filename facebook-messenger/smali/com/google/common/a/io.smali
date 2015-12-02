.class Lcom/google/common/a/io;
.super Lcom/google/common/a/iq;
.source "Maps.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/iq",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/in;


# direct methods
.method constructor <init>(Lcom/google/common/a/in;)V
    .locals 0

    .prologue
    .line 1484
    iput-object p1, p0, Lcom/google/common/a/io;->a:Lcom/google/common/a/in;

    invoke-direct {p0}, Lcom/google/common/a/iq;-><init>()V

    return-void
.end method


# virtual methods
.method a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1486
    iget-object v0, p0, Lcom/google/common/a/io;->a:Lcom/google/common/a/in;

    return-object v0
.end method
