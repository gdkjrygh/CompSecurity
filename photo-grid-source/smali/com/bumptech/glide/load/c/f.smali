.class public interface abstract Lcom/bumptech/glide/load/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/bumptech/glide/load/c/f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lcom/bumptech/glide/load/c/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/bumptech/glide/load/c/g;

    invoke-direct {v0}, Lcom/bumptech/glide/load/c/g;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/c/f;->a:Lcom/bumptech/glide/load/c/f;

    .line 29
    new-instance v0, Lcom/bumptech/glide/load/c/n;

    invoke-direct {v0}, Lcom/bumptech/glide/load/c/n;-><init>()V

    invoke-virtual {v0}, Lcom/bumptech/glide/load/c/n;->a()Lcom/bumptech/glide/load/c/m;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/c/f;->b:Lcom/bumptech/glide/load/c/f;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
