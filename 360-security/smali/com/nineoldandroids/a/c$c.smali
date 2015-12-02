.class Lcom/nineoldandroids/a/c$c;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field public a:Lcom/nineoldandroids/a/c$e;

.field public b:I


# direct methods
.method public constructor <init>(Lcom/nineoldandroids/a/c$e;I)V
    .locals 0

    .prologue
    .line 862
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 863
    iput-object p1, p0, Lcom/nineoldandroids/a/c$c;->a:Lcom/nineoldandroids/a/c$e;

    .line 864
    iput p2, p0, Lcom/nineoldandroids/a/c$c;->b:I

    .line 865
    return-void
.end method
