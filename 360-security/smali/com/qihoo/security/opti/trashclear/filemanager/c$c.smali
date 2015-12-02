.class public Lcom/qihoo/security/opti/trashclear/filemanager/c$c;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)V
    .locals 0

    .prologue
    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->a:Ljava/lang/String;

    .line 144
    iput-wide p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->b:J

    .line 145
    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->c:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    .line 146
    return-void
.end method
