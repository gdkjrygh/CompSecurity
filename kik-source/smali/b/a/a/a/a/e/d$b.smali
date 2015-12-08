.class public interface abstract Lb/a/a/a/a/e/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:Lb/a/a/a/a/e/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 367
    new-instance v0, Lb/a/a/a/a/e/f;

    invoke-direct {v0}, Lb/a/a/a/a/e/f;-><init>()V

    sput-object v0, Lb/a/a/a/a/e/d$b;->a:Lb/a/a/a/a/e/d$b;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
.end method

.method public abstract a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;
.end method
