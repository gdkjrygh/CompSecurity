.class public interface abstract Lb/a/a/a/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a/a/a/i$a;
    }
.end annotation


# static fields
.field public static final d:Lb/a/a/a/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lb/a/a/a/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/a/a/a/i$a;-><init>(B)V

    sput-object v0, Lb/a/a/a/i;->d:Lb/a/a/a/i;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract a(Ljava/lang/Exception;)V
.end method
