.class Lcom/flurry/sdk/id$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/jx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/jx",
        "<",
        "Lcom/flurry/sdk/jd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/id;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/flurry/sdk/id$4;->a:Lcom/flurry/sdk/id;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/flurry/sdk/jd;)V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/flurry/sdk/id$4;->a:Lcom/flurry/sdk/id;

    invoke-static {v0}, Lcom/flurry/sdk/id;->a(Lcom/flurry/sdk/id;)V

    .line 110
    return-void
.end method

.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 106
    check-cast p1, Lcom/flurry/sdk/jd;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/id$4;->a(Lcom/flurry/sdk/jd;)V

    return-void
.end method
