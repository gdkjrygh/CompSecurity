.class final Lcom/kik/cards/usermedia/CustomGalleryActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/usermedia/CustomGalleryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->b:Ljava/lang/String;

    .line 56
    iput-object p3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->c:Ljava/lang/Long;

    .line 57
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->b:Ljava/lang/String;

    return-object v0
.end method
