.class public final Lb/a/hg;
.super Lb/a/a;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "idmd5"

    invoke-direct {p0, v0}, Lb/a/a;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lb/a/hg;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/a/hg;->a:Landroid/content/Context;

    invoke-static {v0}, Lb/a/ff;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
