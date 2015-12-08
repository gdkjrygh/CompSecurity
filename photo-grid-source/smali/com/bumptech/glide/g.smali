.class public final Lcom/bumptech/glide/g;
.super Lcom/bumptech/glide/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        "DataType:",
        "Ljava/lang/Object;",
        "ResourceType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bumptech/glide/e",
        "<TModelType;TDataType;TResourceType;TResourceType;>;"
    }
.end annotation


# instance fields
.field private final g:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<TModelType;TDataType;>;"
        }
    .end annotation
.end field

.field private final h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TDataType;>;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TResourceType;>;"
        }
    .end annotation
.end field

.field private final j:Lcom/bumptech/glide/u;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/h;Ljava/lang/Class;Lcom/bumptech/glide/load/c/s;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;Lcom/bumptech/glide/u;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/h;",
            "Ljava/lang/Class",
            "<TModelType;>;",
            "Lcom/bumptech/glide/load/c/s",
            "<TModelType;TDataType;>;",
            "Ljava/lang/Class",
            "<TDataType;>;",
            "Ljava/lang/Class",
            "<TResourceType;>;",
            "Lcom/bumptech/glide/d/p;",
            "Lcom/bumptech/glide/d/i;",
            "Lcom/bumptech/glide/u;",
            ")V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-static {}, Lcom/bumptech/glide/load/resource/e/e;->b()Lcom/bumptech/glide/load/resource/e/c;

    move-result-object v1

    .line 1041
    invoke-virtual {p2, p5, p6}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/f/b;

    move-result-object v2

    .line 1042
    new-instance v4, Lcom/bumptech/glide/f/e;

    invoke-direct {v4, p4, v1, v2}, Lcom/bumptech/glide/f/e;-><init>(Lcom/bumptech/glide/load/c/s;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/f/b;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v5, p6

    move-object v6, p2

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 60
    invoke-direct/range {v1 .. v8}, Lcom/bumptech/glide/e;-><init>(Landroid/content/Context;Ljava/lang/Class;Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/h;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;)V

    .line 62
    iput-object p4, p0, Lcom/bumptech/glide/g;->g:Lcom/bumptech/glide/load/c/s;

    .line 63
    iput-object p5, p0, Lcom/bumptech/glide/g;->h:Ljava/lang/Class;

    .line 64
    iput-object p6, p0, Lcom/bumptech/glide/g;->i:Ljava/lang/Class;

    .line 65
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/bumptech/glide/g;->j:Lcom/bumptech/glide/u;

    .line 66
    return-void
.end method
