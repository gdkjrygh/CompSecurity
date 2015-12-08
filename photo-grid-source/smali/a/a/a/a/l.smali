.class public interface abstract La/a/a/a/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final d:La/a/a/a/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, La/a/a/a/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/a/m;-><init>(B)V

    sput-object v0, La/a/a/a/l;->d:La/a/a/a/l;

    return-void
.end method


# virtual methods
.method public abstract a()V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation
.end method

.method public abstract a(Ljava/lang/Exception;)V
.end method
