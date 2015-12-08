.class final Lcom/roidapp/imagelib/f/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 629
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 630
    iput-object p1, p0, Lcom/roidapp/imagelib/f/f;->a:Ljava/util/ArrayList;

    .line 631
    iput p2, p0, Lcom/roidapp/imagelib/f/f;->b:I

    .line 632
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 625
    iget-object v0, p0, Lcom/roidapp/imagelib/f/f;->a:Ljava/util/ArrayList;

    return-object v0
.end method
