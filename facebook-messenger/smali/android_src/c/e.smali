.class public final Landroid_src/c/e;
.super Ljava/lang/Object;
.source "Telephony.java"

# interfaces
.implements Landroid_src/c/b;


# static fields
.field public static final a:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1430
    const-string v0, "content://mms/drafts"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Landroid_src/c/e;->a:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1425
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
